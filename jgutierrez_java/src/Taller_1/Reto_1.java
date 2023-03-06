

import java.util.Scanner;
public class Reto_1 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner (System.in);
       
        System.out.println("Ingresa la temperatura del horno en grados fahrenheit");
        
        int f;
       
       

        f= lectura.nextInt();

        int Resultado;
        Resultado= (int) (f - 32/1.8);
        System.out.println("Abuela el horno se encuentra a una temperatura de : "+Resultado + " grados centigrados ");
      
        
        lectura.close();
    }

    @Override
    public String toString() {
        return "Reto_1 []";
    }
}

