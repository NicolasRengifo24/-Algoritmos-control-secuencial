package ejercicios;
/*Una empresa X trabaja con láminas de hierro para fabricar una pieza. Se conoce que (a) la lámina
mide en promedio 4 metros de largo por 1.5 metros de ancho; (b) la pieza a fabricar consume 0.5
metros en total. Se requiere que calcule y muestre cuántas piezas se fabrican con una lámina y
cuánto será el desperdicio. */

public class Empresa {
    public  void ejecutar() {
        
        double areaLamina = 4 * 1.5;
        double areaPieza = 0.5;
        double fabricables = areaLamina / areaPieza;
        double residuo = areaLamina - (areaPieza * fabricables);

        System.out.println("se fabrican : " + fabricables + " piezas");
        System.out.println("sobra : " + residuo + " m2");

        


    }
}
