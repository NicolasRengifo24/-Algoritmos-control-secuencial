/*Calcular el salario neto de un trabajador en función del número de horas trabajadas, el precio de la
hora y considerando un descuento fijo al sueldo base por concepto de impuestos del 20%. */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class salario {
    public static void main(String[] args) {
        int horas,descuento,base,neto;
        int precio = 8000;
        NumberFormat formateo = NumberFormat.getInstance(Locale.getDefault());
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese las horas trabajadas :");
        horas = entrada.nextInt();

        base = horas * precio;
        descuento = (int) (base * 0.20);
        neto = base - descuento;

        System.out.println("Su salario base es de "+ formateo.format(base)+" aplicando el descuento el salario neto es "+ formateo.format(neto));
        System.out.println("el descuento es de :"+ formateo.format(descuento));
    }
}
