package Ejercicios_For;
import java.util.Scanner;

public class EVA1_EJERCICIOSBASICOS_10_DE_EJERICIO {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        System.out.print("Ingresa el número inicial: ");
        int inicio = captura.nextInt();
        System.out.print("Ingresa el número final: ");
        int fin = captura.nextInt();
        
        if (inicio <= fin) {
            System.out.print("Lista de números: ");
            for (int i = inicio; i <= fin; i++) {
                if (i % 2 == 0){
                    System.out.print(i);
                    if (i < fin) {
                    System.out.print(" – "); 
                    }
                }
            }
        }
    }
}
