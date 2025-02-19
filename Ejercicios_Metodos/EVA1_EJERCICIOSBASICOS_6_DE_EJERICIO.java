package Ejercicios_Metodos;
import static Ejercicios_Metodos.MayorQue.Mayor;
import java.util.Scanner;

public class EVA1_EJERCICIOSBASICOS_6_DE_EJERICIO {
    public static void main(String[] args){
    Scanner captura = new Scanner(System.in);
      
    System.out.print("Captura el primer numero: ");
    int a = captura.nextInt();
      
    System.out.print("Captura el segundo numero: ");
    int b = captura.nextInt();
      
    int Mayor = Mayor(a, b);  
    System.out.print("El numero mayor entre " + a + " y " + b + " es: " + Mayor);
    }
}

class MayorQue{
    public static int Mayor(int a,int b){
        return (a > b) ? a:b; 
    }
}
