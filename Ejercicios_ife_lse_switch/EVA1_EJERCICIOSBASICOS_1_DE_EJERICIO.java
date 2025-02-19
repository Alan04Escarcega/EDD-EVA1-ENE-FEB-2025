package Ejercicios_ife_lse_switch;
import java.util.Scanner;

public class EVA1_EJERCICIOSBASICOS_1_DE_EJERICIO {

    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        
        System.out.print("INGRESE EL TOTAL A PAGAR: ");
        double pago = captura.nextDouble();
        
        double  DescuentoEnPorcentaje;
        
        if(pago < 100) {
            DescuentoEnPorcentaje = 0; 
            } else if (pago <= 500) {
            DescuentoEnPorcentaje = 0.10; 
            } else {
            DescuentoEnPorcentaje = 0.20;
            }
        
        double descuento = pago * DescuentoEnPorcentaje;
        double totalPagar = pago - descuento;  
        
        System.out.print("El descuento seria de: " + descuento);
        System.out.println("");
        System.out.print("El total a pagar es de: " + totalPagar);
        System.out.println("");
    }
    
}
