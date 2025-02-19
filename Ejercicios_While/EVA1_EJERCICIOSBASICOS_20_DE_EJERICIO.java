package Ejercicios_While;
import java.util.Scanner;

public class EVA1_EJERCICIOSBASICOS_20_DE_EJERICIO {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        int s=0;
        
        while (true) {
            System.out.print("Ingrese un numero: ");
        int n = captura.nextInt();
            if(n < 0){
               System.out.print("A sido ingresado un numero negativo; ");
               break;    
        }else{
                s+=n;
            }
        }
        System.out.print("La suma de los numeros es de: " + s);
    }
}
