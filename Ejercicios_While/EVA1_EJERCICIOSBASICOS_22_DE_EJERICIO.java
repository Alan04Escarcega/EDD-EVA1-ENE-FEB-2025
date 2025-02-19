package Ejercicios_While;
import java.util.Scanner;

public class EVA1_EJERCICIOSBASICOS_22_DE_EJERICIO {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        System.out.println("IDENTIFICADOR DE NUMEROS PRIMOS");
        System.out.print("Ingrese un numero: ");
        int n = captura.nextInt();
        
        boolean Primo = n > 1;
        int i = 2;
        
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                Primo = false; 
                break;
            }
            i++; 
        }
        if (Primo) {
                System.out.println(n + " es primo");
            } else {
                System.out.println(n + " no es primo");
            }
    }
}