import java.util.Scanner;

public class Reto_4 {
    public static void main(String[] args) {

        Scanner lectura =new Scanner(System.in);

        int cpu = (int)(Math. random()*3+1);
        int opcion;

        System.out.println("Piedra, papel o tijera");
        System.out.println("Escoga piedra(1) papel(2) tijeras(3)");
        opcion = lectura.nextInt();
        if(opcion == 1 && cpu == 2){
            System.out.println("sacaste tijeras y la maquina saco piedra pierdes");
        }
        else if(opcion == 1 && cpu == 3){
            System.out.println("sacaste papel y la maquina saco piedra ganas");
        }
        else if(opcion == 2 && cpu == 3){
            System.out.println("sacaste tijeras y la maquina saco papel ganas");
        }
        else if(opcion == 2 && cpu == 1){
          
            System.out.println("sacaste piedra y la maquina saco tijera ganas");
        }
        else if(opcion == 3 && cpu == 2){
            System.out.println("sacaste papel y la maquina saco tijera pierdes");
        }
        else if(opcion == 3 && cpu == 1){
            System.out.println("sacaste piedra y la maquina saco papel pierdes");
        }
        else{
            System.out.println("Empate");
        }
        lectura.close();
    }
}