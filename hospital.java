/*En un hospital rural existen tres áreas: Ginecología, Pediatría y Traumatología. El presupuesto anual
del hospital se reparte conforme a la siguiente tabla:

Área            Porcentaje  del presupuesto

Ginecología           40%
Traumatología         30%
Pediatría             30%

Obtener la cantidad de dinero que recibirá cada área, para cualquier monto presupuestado. */

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class hospital {
    public static void main(String[] args) {
        
        float ginecología,traumatología,pediatría,presupuesto;

        Scanner entrada = new Scanner(System.in);
        NumberFormat formateo = NumberFormat.getInstance(Locale.getDefault());

        System.out.println("Ingrese el presupuesto ");
        presupuesto = entrada.nextFloat();

        ginecología = (float) (presupuesto * 0.4);
        traumatología = (float) ( presupuesto * 0.3);
        pediatría = (float) (presupuesto * 0.3);

        System.out.println("Ginecologia :" + formateo.format(ginecología));
        System.out.println("Traumatologia :" + formateo.format(traumatología));
        System.out.println("Pedriatria :" + formateo.format(pediatría));



    }
}
