import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = new int[20];

        System.out.println("Introduce 20 numeros");
        for(int i=0;i< numeros.length;i++){
            numeros[i]=teclado.nextInt();
        }

        System.out.println("_________________________________________");
        for(int i=0;i< numeros.length;i++){
            System.out.print("|"+numeros[i]);
        }
        System.out.println("|");
        System.out.println("_________________________________________");
    }
}
