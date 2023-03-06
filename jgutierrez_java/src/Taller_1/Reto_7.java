import java.util.Scanner;

public class Reto_7 {
    public static void main(String[] args) {

        Scanner lectura =new Scanner(System.in);
       
       
        System.out.println("Ingresa el valor de tu compra");

        int bola = (int)(Math. random()*4+1);
        int descuento1;
        int descuento2; 
        int descuento3; 
        int valor;
        int total1; 
        int total2; 
        int total3;

        valor = lectura.nextInt();
        descuento1 = (valor * 10) / 100;
        total1 = valor - descuento1;
        descuento2 = (valor * 30) / 100;
        total2 = valor - descuento2;
        descuento3 = (valor * 50) / 100;
        total3 = valor - descuento3;

        if (valor<50000){
            System.out.println("Tu compra es menor a 50000 no tendras beneficio");
            valor=lectura.nextInt();
        }

        if(bola == 1){
            System.out.println("Felicidades! sacaste la bola roja, obtendras el 10% de descuento: "+total1);
        }
        else if(bola == 2 ){
            System.out.println("Felicidades! sacaste la bola azul, obtendras el 30% de descuento "+total2);
        }
        else if(bola == 3 ){
            System.out.println("Felicidades! sacaste la bola amarilla, obtendras el 50% de descuento "+total3);
        }
        else{
            System.out.println("Felicidades! sacaste la bola blanca, obtendras el 100% de descuento");
        }
        lectura.close();
    }
}