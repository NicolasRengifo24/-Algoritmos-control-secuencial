/*Suponga que a partir de una Tonelada de maíz una planta productora obtiene M kilogramos de
harina y N litros de aceite. La planta vende cada bulto de 24 paquetes de un kilogramo de harina en
Bs. B1 y cada caja de 15 envases de aceite en Bs. B2. Suponiendo que la planta vende todo lo que
produce, calcular el ingreso total por la venta de cada tonelada de maíz, sabiendo además que cada
kilogramo de harina y cada litro de aceite que restan del embalaje se venden al detal a los precios de
Bs. B3 y Bs. B4 respectivamente. Pruebe su algoritmo o programa con los sig. Valores: M=452,
N=197, B1=132, B2= 180, B3= 7,50 y B4= 14,50. Respuesta: 4895 */

public class plantaProductora {
    public static void main(String[] args) {
        
       double m = 452, n = 197, b1 = 132,b2=180;
       double b3 = 7.50, b4 = 14.50; 

        // aqui obtengo la cantidad de bultos y cajas y tambien  resto la perte entera a la parte decimal para poder operar el valor decimal

        double totalBultos =  m / 24;
        int detalBultos = (int) totalBultos;
        double totalDetalB = totalBultos - detalBultos;

    
        
        double totalCajas =  n / 15 ;
        int detalAceite = (int) totalCajas;
        double totalDetalA = totalCajas - detalAceite;



        System.out.println(totalBultos + "----" + totalCajas);
        int ventaBultos = (int) (totalBultos * b1);
        int ventaCajas = (int) (totalCajas * b2);
        double ventaDetalB =  totalDetalB * b3;
        double ventaDetalA = totalDetalA *b4;


        System.out.println(ventaBultos + ventaCajas );
        System.out.println(ventaDetalA + ventaDetalB);
    





    }
}
