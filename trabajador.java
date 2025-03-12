/* Se conoce de un trabajador su nombre, el número de horas normales trabajadas, el pago de una hora
normal y el número de horas extras trabajadas. Además, que, cada hora extra se paga 25% más del
valor de una hora normal. Si se deducen al trabajador sobre el sueldo base 5% del paro forzoso, 2%
de política habitacional y 7% para caja de ahorro. Si se le asignan 25000 Bolívares por actualización
académica, 17300 Bolívares por cada hijo y una prima por hogar de 18000 Bolívares. Calcule y
muestre las asignaciones, las deducciones y el sueldo neto del trabajador. */

import java.util.Scanner;

public class trabajador {
    public static void main (String[] args){

        String nombre;
        int horasNormales,horasExtra,baseSin,baseCon,base,neto,paroForzoso,PoliticaHabit,cajaAhorro,actualizacionAcadem,hijos,primaHogar,pagoPorHijo;
        int pagoHora = 100;
        

        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese su nombre ");
        nombre = entrada.nextLine();

        System.out.println("Ingrese las horas normales trabajadas");
        horasNormales = entrada.nextInt();

        System.out.println("ingrese las horas extras trabajadas");
        horasExtra = entrada.nextInt();

        System.out.println("ingrese el total de hijos que tiene");
        hijos = entrada.nextInt();
        
        // aqui calculo el valor de las horas extras y el sueldo mas esas horas extras

        baseSin = pagoHora * horasNormales;
        baseCon = (int) (pagoHora * 0.25) * horasExtra;
        base = baseSin + baseCon;

        // aqui se calculan los valores de las deducciones

        paroForzoso = (int) (base * 0.05);
        PoliticaHabit = (int) (base * 0.02);
        cajaAhorro = (int) (base * 0.07);

        // aqui se inicializan las asignaciones y se hace el calculo de cuanto son las asignacones por hijo

        actualizacionAcadem = 25000;
        pagoPorHijo = hijos * 17300;
        primaHogar = 18000;

        //imprimimos el sueldo base con asignaciones

        base = base + (actualizacionAcadem + pagoPorHijo + primaHogar);
        
        System.out.println("su sueldo con asignaciones es de : " + base + " bolivares");

        // imprimimos las asignaciones

        System.out.println( nombre + " sus asignaciones son : " + actualizacionAcadem + "  bolivares de actualizacion academica " + " mas " + pagoPorHijo + "  bolivares por sus " + hijos + " hijos " + " mas "+ primaHogar + " bolivares  de prima de hogar");

        // imprimimos las deducciones

        System.out.println(" a su sueldo base con horas extras y asignaciones de : "+ base + " se le deducen : " + paroForzoso + " bolivares  de paro Forzoso,  más "+ PoliticaHabit + "  bolivares de politica Habitacional, más " + cajaAhorro + " bolivares de caja Ahorro");


        //imprimo sueldo neto

        neto = base - (paroForzoso + PoliticaHabit + cajaAhorro); 

        System.out.println("su sueldo neto sera de : " + neto + " bolivares");




        
    
        
        

    }
}