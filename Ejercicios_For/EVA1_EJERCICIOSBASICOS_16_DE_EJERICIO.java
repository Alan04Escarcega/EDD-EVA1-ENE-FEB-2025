package Ejercicios_For;
import java.util.Scanner;

public class EVA1_EJERCICIOSBASICOS_16_DE_EJERICIO {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String cadena = captura.nextLine();

        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }

        System.out.println("Cadena invertida: " + cadenaInvertida);   
    }
}

    

