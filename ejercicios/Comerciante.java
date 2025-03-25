package ejercicios;

/*Un comerciante de computadores ofrece P precio por compra al contado ó 12 cuotas de T Bolívares
cada una. Desarrolle un programa para calcular y mostrar cuál es el porcentaje que se cobra por el
recargo en el pago del computador por cuotas. */

public class Comerciante {
    public  void ejecutar(){
        
        int contado = 100000;
        int cuotas = 10000;
        int cantidadCuotas = 12;

        int diferencia = (cuotas * cantidadCuotas) - contado;

        
        double porcentaje = (double) (diferencia *100)/contado;

        


        System.out.println(porcentaje + "%");
        
        
    }
}
