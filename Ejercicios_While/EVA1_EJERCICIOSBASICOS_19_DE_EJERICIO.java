package Ejercicios_While;
import java.util.Scanner;

public class EVA1_EJERCICIOSBASICOS_19_DE_EJERICIO {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        System.out.print("Ingresa el numero de inicio: ");
        int i = captura.nextInt();
        
        System.out.print("Ingresa el numero final: ");
        int f = captura.nextInt();
        
        int j = i;
        while (j <= f) {
            System.out.println(j);
            j += 1;
        }
    }
}