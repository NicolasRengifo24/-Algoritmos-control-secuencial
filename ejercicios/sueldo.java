
import java.util.Scanner;

/*Un vendedor recibe un sueldo base, más un 10% extra por comisiones de sus ventas. El vendedor
desea saber cuánto dinero obtendrá por concepto de comisiones por las tres ventas que realizó en
el mes y el total que recibirá tomando en cuenta su sueldo base y sus comisiones. */

public class sueldo {
    public static void main(String[] args) {
        
        int sueldo_base = 1400000;
        int sueldo_total = 0;
        int venta1 = 0;
        int venta2 = 0;
        int venta3 = 0;
        

        
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de la venta 1 :");
        venta1 = entrada.nextInt();

        System.out.println("Ingrese el valor de la venta 2 :");
        venta2 = entrada.nextInt();

        System.out.println("Ingrese el valor de la venta 3 :");
        venta3 = entrada.nextInt();
        
        int totalv = venta1 + venta2 + venta3;
        int comision = (totalv * 10)/100;
        sueldo_total = (sueldo_base + comision);


        System.out.println("Tienes un total de :" + totalv + "en ventas ");
        System.out.println("Generas una comision por ventas de:" + comision);
        System.out.println("el total de tu sueldo base "+ "(" + sueldo_base + ")" +"mas comisiones es de :" + sueldo_total);


         
    }
}
