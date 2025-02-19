package Ejercicios_ife_lse_switch;
import java.util.Scanner;

public class EVA1_EJERCICIOSBASICOS_2_DE_EJERICIO {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        
        System.out.print("Ingresa la calificacion entre 0-100: ");
        double Calificacion = captura.nextDouble();
        
        String NotaAlfabetica;
        if(Calificacion >= 90){
            NotaAlfabetica = "A";
        } 
            else if(Calificacion >= 80){
                NotaAlfabetica = "B";
            }
            else if(Calificacion >= 70){
                NotaAlfabetica = "C";
            }
            else if(Calificacion >= 60){
                NotaAlfabetica = "D";
            }
            else{NotaAlfabetica = "F";
            }
    System.out.println("La calificacion en Nota Alfabetica: " + NotaAlfabetica);
                    
        
        
    }
    
}
