package Ejercicios_For;
import java.util.Scanner;

public class EVA1_EJERCICIOSBASICOS_18_DE_EJERICIO {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        System.out.print("Ingrese el numero de secuencia finbonacci: ");
        byte n = captura.nextByte();
        
        int a = 0, b = 1, c;  
        
        System.out.println("SECUENCIA DE FIBONACCI HASTA EL TÉRMINO " + n);
        for (int i = 0; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b; 
            b = c;
            
        }
    System.out.println();
    }
}
