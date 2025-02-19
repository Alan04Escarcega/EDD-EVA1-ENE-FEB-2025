/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EVA1_20_FACTORIAL;

/**
 *
 * @author fer17
 */
public class EVA1_FACTORIAL {
    public static void main(String[] args){
       /* long factorial = 1;
        for(int i = 5; i > 0; i--){
            System.out.println(i + " - ");
            factorial *= i;
        }
        System.out.println("El factorial del numero es: " + factorial);*/
       int factorial;
       factorial = calculaFactorial(5);
       System.out.print("el factorial de 5 es "+ factorial);
    }    

    public static int calculaFactorial(int num){
        //forma de resolver el problema
        //manera de detener la recursividad
        //recursividad
        if(num == 0)
            return 1;
        else
        return num * calculaFactorial(num - 1);
        
    }
   
}            
        
            
   
        
    
    
