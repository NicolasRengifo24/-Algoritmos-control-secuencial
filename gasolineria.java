/*Resuelva el problema que tienen en una gasolinera. Los surtidores de la misma registran lo que
surten en galones, pero el precio de la gasolina está fijado en litros. Se requiere que calcule y muestre
lo que hay que cobrarle a un cliente, considerando que: (a) cada galón tiene 3.785 litros; (b) el precio
del litro es de 100 Bolívares. */



public class gasolineria {
    public static void main (String [] args){

        double surtidorGalones = 1, litrosgalon = 3.785 , precioLitro = 100;

        float totalGalones = (float) (surtidorGalones / litrosgalon);
        double totalPagar = (litrosgalon * surtidorGalones)*precioLitro;
        
        System.out.println("el surtidor marca : "+ String.format("%.2f",totalGalones) +" Galones");
        System.out.println("el clciente paga : "+ totalPagar + " bolivares");


    }
}
