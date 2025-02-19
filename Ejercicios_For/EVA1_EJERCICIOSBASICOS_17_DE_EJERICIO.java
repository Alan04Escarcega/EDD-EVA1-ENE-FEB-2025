/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_For;
import java.util.Scanner;
/**
 *
 * @author fer17
 */
public class EVA1_EJERCICIOSBASICOS_17_DE_EJERICIO {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);

        System.out.print("Ingrese la altura del triángulo: ");
        int a = captura.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


