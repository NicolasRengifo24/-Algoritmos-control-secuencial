/*Suponga que un individuo decide invertir su capital en un banco y desea saber cuánto dinero ganará
después de un mes si el banco paga a razón de 2% mensual. */
import java.util.Scanner;

public class capital {
    public static void main(String[] args) {
        int inversion;
       

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("ingrese el monto de su sinversion");
        inversion = entrada.nextInt();
        
        int rentabilidad = (inversion * 2)/100;

    System.out.println("El total de ganancia obtenida para la inversion de : "+ inversion + " despues de un mes será de: "+ rentabilidad);
        
    }
}
/*pendiente configurar los puntos de miles */