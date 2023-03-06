

import java.util.Scanner;

public class numeros {
    public static void main(String[] args) throws Exception {
        int numero;
        Scanner lectura=new Scanner(System.in);
        System.out.println("ingrese un numero");
        numero = lectura.nextInt();
        if(numero>0){
            System.out.println("numero es positivo");
        }
        else if (numero<0){
            System.out.println("numero es negativo");
        }
        else{
            System.out.println("numero es neutro");
        }
        lectura.close();
    }   
}
