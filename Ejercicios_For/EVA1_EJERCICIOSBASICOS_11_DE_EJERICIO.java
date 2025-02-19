package Ejercicios_For;
import java.util.Scanner;

public class EVA1_EJERCICIOSBASICOS_11_DE_EJERICIO {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        System.out.print("Ingrese el numero deseado a generar la tabla de multiplicar: ");
        int tabla = captura.nextInt();
        
        for(int i = 1; i <= 10; i++){
             System.out.println(tabla + " x " + i + " = " + (tabla * i));
        }
    }
}
