/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EVA1_21_MCD;
import java.util.Scanner;

public class EVA1_21_MCD {
    public static void main(String[] args){
        Scanner captura = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int MCD1 = captura.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int MCD2 = captura.nextInt();
        
        int resultado = calculaMCD(MCD1, MCD2);
        System.out.print("El maximo comun divisor de los numeros solicitados es de: " + resultado);
    }
    
    public static int calculaMCD(int MCD1, int MCD2){
        if(MCD2 == 0){
            return MCD1;    
        }else{
            return calculaMCD(MCD2, MCD1 % MCD2); 
        }  
    }
}


