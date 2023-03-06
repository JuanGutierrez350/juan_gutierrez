import java.util.Scanner;

public class Reto_2 {
    public static void main(String[] args) throws Exception {
        Scanner lectura = new Scanner (System.in);
        
        System.out.println("Ingrese el peso del bebe");
        int peso;
        int meses;
        int dosis;

        peso= lectura.nextInt();
        System.out.println("Ingrese los meses del bebe");

        meses= lectura.nextInt();
        
        dosis= ((peso + 10)/(meses *10)) *8;

        System.out.println("Las dosis a aplicar es: "+dosis);
    
     
        
        lectura.close();
    }
}
