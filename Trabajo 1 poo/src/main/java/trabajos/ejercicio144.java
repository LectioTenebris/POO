package trabajos;
import java.util.Scanner;
public class ejercicio144 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        double numero;
        System.out.println("Ingrese el numero");
        numero = leer.nextDouble();
        double cuadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);
        System.out.println("El cuadrado del numero es: "+cuadrado);
        System.out.println("El cubo del numero es: "+cubo);    
    }
}
