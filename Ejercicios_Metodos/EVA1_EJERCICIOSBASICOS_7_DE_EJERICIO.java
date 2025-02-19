package Ejercicios_Metodos;
import static Ejercicios_Metodos.Invertido.Invertido;
import java.util.Scanner;

public class EVA1_EJERCICIOSBASICOS_7_DE_EJERICIO {
    public static void main(String[] args){
    Scanner captura = new Scanner(System.in);
    System.out.print("Capture la palabra a invertir: ");
    String texto = captura.nextLine();
    
    String textoInvertido = Invertido(texto);
    
    System.out.println("Texto original: " + texto);
    System.out.println("Texto invertido: " + textoInvertido);
    }
}
class Invertido{
    public static String Invertido(String cadena){
        char[] caracteres = cadena.toCharArray();
        
        int a = 0;
        int b = caracteres.length - 1;
        while (a < b){
            char temp = caracteres[a];
            caracteres[a] = caracteres[b];
            caracteres[b] = temp;
            a++;
            b--;
        }
        return new String(caracteres);
    }
}