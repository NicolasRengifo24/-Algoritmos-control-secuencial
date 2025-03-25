package ejercicios;
/*Calcular y mostrar el monto total a pagar en un mes de luz eléctrica, teniendo como dato la lectura
anterior, la lectura actual y el costo por kilovatio. */
import java.util.Locale;
import java.text.NumberFormat;

public class Luzelectrica {
    public  void ejecutar() {
        
        NumberFormat formateo = NumberFormat.getInstance(Locale.getDefault());

        double consAnterior = 3.7;
        double consActual = 4.5;

        double kilovatio = 731.03;

        double dias = 30;
        double totalPagar =  dias * kilovatio;
        
        System.out.println("el valor total del mes es : " + formateo.format(totalPagar));




    }
}
