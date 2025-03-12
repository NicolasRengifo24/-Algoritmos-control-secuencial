/*Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea saber cuánto
deberá pagar finalmente por su compra. */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class tienda {
    public static void main(String[] args) {
        
        int compra = 0;
        
         NumberFormat formateo = NumberFormat.getInstance(Locale.getDefault());

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de la compra :");
        compra = entrada.nextInt();
        
        int desc = (compra * 15)/100;
        int total = compra - desc;

       

        System.out.println("su compra fue de : "+ formateo.format(compra) + " aplicando su 15% de descuento : "+ formateo.format(total));
    }
}
