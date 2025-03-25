package ejercicios;
/*Un mayorista compra a un agricultor un lote de X naranjas a Bs. Y la docena. Después de vender
todas las naranjas a los detallistas, obtiene Bs. K. Calcular el porcentaje de ganancia obtenida en la
inversión. Pruebe su programa con los siguientes valores: X=48000, Y=6, K=42000 para obtener 75%
como resultado. */

public class Mayorista {
    public  void ejecutar(){

        int costo = (48000 / 12)*6;
        int ganancia = 42000 - costo;

        double porcentajeGanancia = (ganancia * 100) / costo; 

        System.out.println(porcentajeGanancia);

    }
}
