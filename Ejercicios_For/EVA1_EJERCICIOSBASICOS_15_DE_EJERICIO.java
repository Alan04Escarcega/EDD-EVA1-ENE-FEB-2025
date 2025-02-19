package Ejercicios_For;

public class EVA1_EJERCICIOSBASICOS_15_DE_EJERICIO {
    public static void main(String[] args){
        int inicio = 1;
        int fin = 100;
        
        int numeroPrimos = 0;
        
        for(int i = inicio; i <= fin; i++){
            if (Primo(i)) {
                System.out.print(i + " "); 
                numeroPrimos++;
            }
        }
        System.out.println("Total de números primos: " + numeroPrimos);
    }        
    public static boolean Primo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0){
                return false;
            }     
        }
        return true;
    }
}
