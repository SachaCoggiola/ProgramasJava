package guiaPractica3;

public class ejercicio2 {
    public static void main(String[] args) {
        String[] vector = new String[2];
        vector[0] = "Sacha";
        vector[1] = "Coggiola";
        System.out.println("Mi nombre es: ");
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
    }
}
