package Ejercicios_ife_lse_switch;
import java.util.Scanner;

public class EVA1_EJERCICIOSBASICOS_4_DE_EJERICIO {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        
        System.out.print("Ingresa la edad de la persona: ");
        double Edad = captura.nextDouble();
        
        String Clasificacion;
        if(Edad <= 12){
            Clasificacion = "Nino";} 
        else if(Edad >= 13 && Edad <= 17){
            Clasificacion = "Adolecente";
            }
        else if(Edad >= 18 && Edad <= 64){
            Clasificacion = "Adulto";
            }
        else {Clasificacion = "Adulto mayor";
            }
    System.out.println("La persona estaria Clasificada en: " + Clasificacion);
                    
        
        
    }
}
