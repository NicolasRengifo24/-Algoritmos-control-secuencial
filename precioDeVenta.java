/*Dados como datos el precio final pagado por un producto y su precio de venta al público (PVP), se
requiere que calcule y muestre el porcentaje de descuento que le ha sido aplicado. */

public class precioDeVenta {
    public static void main(String[] args) {
        
      int precioFinal = 100000;
      int pvp = 80000;
      
      int descuento = (int) ((pvp * 100)/precioFinal);

      System.out.println(descuento);

    }
}
