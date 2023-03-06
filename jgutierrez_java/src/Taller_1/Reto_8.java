import java.util.Scanner;

public class Reto_8 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner(System.in);

        int cantidad; 
        int cambio;
        int acumulador; 
        int acumulador2;
        int siguiente; 
        int precio;
        int descuento1;
        int descuento2; 
        int descuento3; 
        int pago;
        int descuento4; 
        int descuento5;
        int descuento6;
      
    siguiente = 1;
    acumulador = 0;
    acumulador2 = 0;

while (siguiente == 1) {
System.out.println("Ingresa el precio del producto");
precio=lectura.nextInt();
System.out.println("Ingresa la cantidad del producto");
cantidad=lectura.nextInt();
System.out.println("Deseas registrar otro gasto 1. si 2. no");
siguiente=lectura.nextInt();

acumulador2 = precio * cantidad ;
acumulador= acumulador + acumulador2 ;
}
System.out.println("Su valor a pagar es " + acumulador);
 
        int lucky = (int)(Math.random()*4+1);
        if (acumulador<50000){
            System.out.println("Su compra es menor que 50000, no tiene beneficio");
        } else if (lucky == 1) {
            System.out.println("Felicidades! sacaste la bola roja, obtendras el 10% de descuento");
            descuento1= (acumulador * 10) / 100;
            descuento4= acumulador - descuento1;
            System.out.println("Tu valor a pagar es " + descuento4);
            System.out.println("Cantidad con la que desea pagar ");
            cambio=lectura.nextInt();
            pago = cambio - descuento4;
             System.out.println("Tu cambio es de " + pago);
        }  else if (lucky == 2) {
            System.out.println("Felicidades! sacaste la bola azul, obtendras el 30% de descuento");
            descuento2= (acumulador * 30) / 100;
            descuento5= acumulador - descuento2;
            System.out.println("Tu valor a pagar es " + descuento5);
            System.out.println("Cantidad con la que desea pagar ");
            cambio=lectura.nextInt();
            pago = cambio - descuento5;
            System.out.println("Tu cambio es de " + pago);
        }   else if (lucky == 3) {
            System.out.println("Felicidades! sacaste la bola amarilla, obtendras el 50% de descuento");
            descuento3= acumulador / 2;
            descuento6= acumulador - descuento3;
            System.out.println("Tu valor a pagar es " + descuento6);
            System.out.println("Cantidad con la que desea pagar ");
            cambio=lectura.nextInt();
            pago = cambio - descuento6;
            System.out.println("Tu cambio es de " + pago);
        }   else if (lucky == 4) {
            System.out.println("Felicidades! sacaste la bola blanca, obtendras el 100% de descuento");
        }
 lectura.close();
}
}