

import java.util.Scanner;

public class multiplicacion {

    public static void main(String[] args) throws Exception {
        Scanner lectura=new Scanner(System.in);

        int number1;
        int number2;
        int suma;
        int resta;
        int multiplicacion;
    
        System.out.println("Ingrese el primer numero");
        System.out.println("Ingrese el segundo numero");

         number1=lectura.nextInt();
         number2=lectura.nextInt();
         suma=number1+number2;
         resta=number2-number1;
         multiplicacion=number1*number2;

         if(number1>number2)
         {
            System.out.println("El numero " +number1+ " es mayor que el numero " +number2+ " y su suma da como resultado "+ suma);
         }

         else if(number1==number2){
            System.out.println("Los numeros son iguales y su multiplicacion da como resultado "+multiplicacion);

         }
         else{
            System.out.println("El numero " +number2+ " es mayor que el numero " +number1+ " y su resta da como resultado " + resta);
         }

         lectura.close(); 
}


}

