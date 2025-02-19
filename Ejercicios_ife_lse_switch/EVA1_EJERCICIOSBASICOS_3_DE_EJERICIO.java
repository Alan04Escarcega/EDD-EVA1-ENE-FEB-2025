package Ejercicios_ife_lse_switch;
import java.util.Scanner;
/**
 *
 * @author fer17
 */
public class EVA1_EJERCICIOSBASICOS_3_DE_EJERICIO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del primer lado: ");
        double lado1 = input.nextDouble();
        
        System.out.print("Ingrese el tamaño del segundo lado: ");
        double lado2 = input.nextDouble();
        
        System.out.print("Ingrese el tamaño del tercer lado: ");
        double lado3 = input.nextDouble();
            
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triangulo es Equilatero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triangulo es Isoceles");
            } else {
                System.out.println("El triangulo es Escaleno");
            }
    }
}

