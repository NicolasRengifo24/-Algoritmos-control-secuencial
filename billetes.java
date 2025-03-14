/*Determine cuánto dinero hay en un banco que contiene N1 billetes de 50000, N2 billetes de 20000,
N3 billetes de 10000, N4 billetes de 5000, N5 billetes de 2000, N6 billetes 1000, N7 billetes de 500 y
N8 billetes de 100. */

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class billetes {
    public static void main(String[] args) {
    
        int n1,n2,n3,n4,n5,n6,n7,n8,total;

        Scanner entrada = new Scanner(System.in);
        NumberFormat formateo = NumberFormat.getInstance(Locale.getDefault());

        System.out.println("ingrese la cantidad  de billetes de 50.000");
        n1 = entrada.nextInt();

        n1 = n1 * 50000;

        System.out.println("ingrese la cantidad de billetes de 20.000");
        n2 = entrada.nextInt();

        n2 = n2 * 20000;

        System.out.println("ingrese la cantidad de billetes de 10.000");
        n3 = entrada.nextInt();

        n3 = n3 * 50000;

        System.out.println("ingrese la cantidad de billetes de 5.000");
        n4 = entrada.nextInt();

        n4 = n4 * 5000;

        System.out.println("ingrese la cantidad de billetes de 2.000");
        n5 = entrada.nextInt();

        n5 = n5 * 2000;

        System.out.println("ingrese la cantidad de billetes de 1.000");
        n6 = entrada.nextInt();

        n6 = n6 * 1000;

        System.out.println("ingrese la cantidad de monedas de 500");
        n7 = entrada.nextInt();

        n7 = n7 * 500;

        System.out.println("ingrese la cantidad de monedas de 100");
        n8 = entrada.nextInt();

        n8 = n8 * 100;


        System.out.println("el banco tiene : " + formateo.format(n1) + " en billetes de 50.000");
        System.out.println("el banco tiene : " + formateo.format(n2) + " en billetes de 20.000");
        System.out.println("el banco tiene : " + formateo.format(n3) + " en billetes de 10.000");
        System.out.println("el banco tiene : " + formateo.format(n4) + " en billetes de 5.000");
        System.out.println("el banco tiene : " + formateo.format(n5) + " en billetes de 2.000");
        System.out.println("el banco tiene : " + formateo.format(n6) + " en billetes de 1.000");
        System.out.println("el banco tiene : " + formateo.format(n7) + " en monedas de 500");
        System.out.println("el banco tiene : " + formateo.format(n8) + " en monedas de 100");


        total = n1+n2+n3+n4+n5+n6+n7+n8;

        System.out.println("El banco en total tiene :" + formateo.format(total));



    }
}
