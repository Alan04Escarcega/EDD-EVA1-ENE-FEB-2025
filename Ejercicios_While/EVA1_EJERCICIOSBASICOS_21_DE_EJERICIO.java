package Ejercicios_While;
import java.util.Scanner;

public class EVA1_EJERCICIOSBASICOS_21_DE_EJERICIO {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        System.out.print("Ingrese un numero a valorar: ");
        int n = captura.nextInt();
        int s= 0;
        
        while(n!=0){
            s += n % 10; 
            n /= 10;
        }
        System.out.println("La suma de los dígitos es: " + s);
    }
    
}
