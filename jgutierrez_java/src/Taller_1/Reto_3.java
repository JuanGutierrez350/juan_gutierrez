import java.util.Scanner;

public class Reto_3 {
    public static void main(String[] args) {
        Scanner lectura =new Scanner(System.in);
        
        int opcion;
        int numero = (int)(Math. random()*2+1);

        System.out.println("Escoge cara(1) o sello(2)");
        opcion = lectura.nextInt();

        if(numero == 1 && opcion == 1){
            System.out.println("Escogiste sello, ganaste ");
        }
        else if(numero == 2 && opcion == 2){
            System.out.println("Escogiste cara, ganaste!");
        }
        else{
            System.out.println("Perdiste!");
        }      
        lectura.close();
    }
}