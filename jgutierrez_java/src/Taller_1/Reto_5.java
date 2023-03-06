import java.util.Scanner;

public class Reto_5 {
    public static void main(String[] args) {
        Scanner lectura =new Scanner(System.in);

        String union;
        String nombre;
        String apellido;
        String nombrecompleto; 
        

        System.out.println("Ingrese su nombre");
        nombre = lectura.nextLine();
        System.out.println("Ingrese su apellido");
        apellido = lectura.nextLine();
        System.out.println("la longitud del nombre es " +nombre.length()+ " y del apellido es "+apellido.length());
        System.out.println("Nombre en mayusculas: " +nombre.toUpperCase()+ " El apellido en minusculas: " +apellido.toLowerCase());
        nombrecompleto = nombre + apellido;
        System.out.println("Nombre completo es: "+nombrecompleto);
        union = nombre.substring(0,2) + apellido;
        System.out.println("la combiacion de las dos primeras letras del nombre y el apellido son: " +union); 
        lectura.close();
    }
}