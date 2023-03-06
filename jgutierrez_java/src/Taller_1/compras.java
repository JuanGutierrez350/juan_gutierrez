
import java.util.Scanner;
public class compras {
    public static void main(String[] args) throws Exception {
        Scanner compras = new Scanner(System.in);
    System.out.println("Digite el precio de los productos");
    System.out.println("Digite la cantidad de productos");
        
    int precio;
    int cantidad;
    int total; 

    precio= compras.nextInt();
        cantidad= compras.nextInt();
        total= precio*cantidad;

System.out.println("El valor de la compra es" + total);



System.out.println("Ingrese el valor con el que paga");

int valorpaga;
int cambio;

valorpaga= compras.nextInt();
 
        cambio= valorpaga - total;
        System.out.println("Su cambio es"+ cambio);
    compras.close();
        

}
}