package ejercicios;
/*Dados como datos el precio final pagado por un producto y su precio de venta al público (PVP), se
requiere que calcule y muestre el porcentaje de descuento que le ha sido aplicado. */

public class PrecioDeVenta {
    public  void ejecutar() {
        
      int precioFinal = 200000;
      int pvp = 80000;
      int descuento =(precioFinal - pvp) * 100 / precioFinal;
      
      

      System.out.println(descuento + "%");



    }
}
