package trabajos;
import java.util.Scanner;
public class n17 {
    public static void main(String[] args){
        double radio, area, longcir;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio del circulo");
        radio = leer.nextDouble();
        longcir = 2*(Math.PI*radio);
        area = Math.PI * (Math.pow(radio, 2));
        System.out.println("El area del circulo es: "+ area);
        System.out.println("La longitud de circunferencia del circulo es: "+ longcir);
    }
    
}
