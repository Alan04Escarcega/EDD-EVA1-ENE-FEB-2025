package Ejercicios_ife_lse_switch;

import java.util.Scanner;

public class EVA1_EJERCICIOSBASICOS_5_DE_EJERICIO {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        
        System.out.print("Capture su nombre: ");
        String n = captura.next();
        
        System.out.print("Capture el peso en kilogramos: ");
        double p = captura.nextDouble();
        
        System.out.print("Capture su altura en metros: ");
        double a = captura.nextDouble();
        
        double IMC = (p / (a * a));
        String imc;
        if(IMC < 18.5){
            imc = "Bajo Peso";
        }
        else if(IMC >= 18.5 && IMC <= 24.9){
            imc = "Normal";
        }
        else if(IMC >= 25 && IMC <= 29.9){
            imc = "sobre Peso";
        }
        else if(IMC >= 30 && IMC <= 34.9){
            imc = "Obesisdad 1";
        }
        else if(IMC >= 35 && IMC <= 39.9){
            imc = "Obesisdad 2";
        }
        else{imc = "Obesidad 3";
        }
        System.out.println("Tu IMC es de:" + imc );
    }    
}
