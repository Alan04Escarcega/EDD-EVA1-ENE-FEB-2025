package Ejercicios_Metodos;
import java.util.Scanner;

public class EVA1_EJERCICIOSBASICOS_8_DE_EJERICIO {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        
        System.out.print("Ingresa una cadena de texto: ");
        String texto = captura.nextLine();
        
        System.out.print("Ingresa un carácter: ");
        char caracter = captura.nextLine().charAt(0); 
        
        int resultado = contarCaracter(texto, caracter);
        System.out.println("El carácter '" + caracter + "' aparece " + resultado + " veces en la cadena.");
    }

    public static int contarCaracter(String cadena, char caracter) {
        cadena = cadena.toLowerCase();
        caracter = Character.toLowerCase(caracter);
        
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }
        return contador;
    }

    
}    
    
