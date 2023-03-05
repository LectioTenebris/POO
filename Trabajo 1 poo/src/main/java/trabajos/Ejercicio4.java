package trabajos;
import java.util.Scanner;
public class Ejercicio4 {

   
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese la edad de juan");
         int ejuan = leer.nextInt();
         int ealberto = (ejuan*2/3);
         int eana = (ejuan*4/3);
         int emama = (eana+ealberto+ejuan);
         System.out.println("Edad juan: "+" "+ ejuan +" "+ "Edad alberto: "+" "+ ealberto +" "+ "Edad ana: "+" "+ eana +" "+ "Edad mama: " + emama  );
        
    }
    
}
