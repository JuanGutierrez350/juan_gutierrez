import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Hello, World!");
        System.out.println("Ingrese un numero");
        System.out.println("Ingrese un numero");
        int numberOne;
        int numberTwo;
        int Resultado;

        numberOne= lectura.nextInt();
        numberTwo= lectura.nextInt();
        Resultado= numberOne + numberTwo;
        System.out.println("El numero ingresado es: "+numberOne);
        System.out.println("EL numero ingresado es: "+numberTwo);
        System.out.println("El resultado de la suma es: "+Resultado);
        lectura.nextLine(); //limpieza del buffer 
        System.out.println("Ingrese un nombre");
        String nombre;

        nombre= lectura.nextLine();
        System.out.println("Hola " +nombre +" ingresaste los numeros "+ numberOne  + " y " +numberTwo +  "y elresultado de la suma es: "+Resultado);
        lectura.close();
    }
}
