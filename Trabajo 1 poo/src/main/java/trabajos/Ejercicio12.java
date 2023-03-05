package trabajos;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        double horas, rate, retencion;
        System.out.println("Ingrese las horas que trabaja en la semana");
        horas= leer.nextDouble();
        System.out.println("Ingrese la razón de pago por hora");
        rate = leer.nextDouble();
        retencion = 0.125;
        double salariobruto= (horas*rate);
        double tamretencion = (salariobruto*retencion);
        double salneto = (salariobruto-(salariobruto*retencion));
        System.out.println("El salario bruto es: "+salariobruto);
        System.out.println("El salario neto es: "+salneto);
        System.out.println("La cantidad retenida en fuente es: "+tamretencion);
        
        
       
    }
    
    
}
