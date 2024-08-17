package personal;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/TATETI")
public class TATETIServlet extends HttpServlet {
    private int[][] board = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    private boolean turnX = true;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String position0 = request.getParameter("row");
        String position1 = request.getParameter("col");

        if (position0 != null && position1 != null) {
            int row = Integer.parseInt(position0);
            int col = Integer.parseInt(position1);

            if (board[row][col] == 0) {
                board[row][col] = turnX ? 1 : 2;
                turnX = !turnX;
            }
        }

        request.setAttribute("board", board);
        request.setAttribute("turnX", turnX);
        request.setAttribute("winner", checkWinner(board) ? (turnX ? "O" : "X") : null);
        request.getRequestDispatcher("/tateti.jsp").forward(request, response);
    }

    private boolean checkWinner(int[][] board) {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] != 0) ||
                    (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] != 0)) {
                return true;
            }
        }
        if ((board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != 0) ||
                (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != 0)) {
            return true;
        }
        return false;
    }
}
