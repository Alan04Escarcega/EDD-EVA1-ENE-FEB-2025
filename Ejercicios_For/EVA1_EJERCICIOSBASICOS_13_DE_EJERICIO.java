package Ejercicios_For;
import java.util.Scanner;

public class EVA1_EJERCICIOSBASICOS_13_DE_EJERICIO {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        System.out.print("Ingrese el numero a factorizar: ");
        int numero = captura.nextInt();
        
        long factorial = 1;
        for(int i =numero ; i > 0; i--){
            System.out.println(i + " - ");
            factorial *= i;
        }
        System.out.println("El factorial del numero es: " + factorial);
    }    
}
