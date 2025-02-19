package Ejercicios_For;

public class EVA1_EJERCICIOSBASICOS_14_DE_EJERICIO {
    public static void main(String[] args){
        int n = 10;
        int a = 0;
        int b = 1;
        
        System.out.println("SECUENCIA DE FIBONACCI HASTA EL TÉRMINO " + n);
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    System.out.println();
    }
}

