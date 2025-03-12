/*El cambio de divisas en la bolsa de Madrid el 25/08/1987 fue el siguiente
100 chelines austríacos = 956.871 pesetas
 1 dólar EEUU = 122.499 pesetas
100 dracmas griegos = 88.607 pesetas
100 francos belgas = 323.728 pesetas
1 franco francés = 20.110 pesetas
1 libra esterlina = 178.938 pesetas
100 liras italianas = 9.289 pesetas 
Lea una cantidad en chelines austriacos e imprima el equivalente en pesetas. Lea una
cantidad en dracmas griegos e imprima su equivalente en francos franceses. Finalmente, lea una
cantidad en pesetas e imprima su equivalente en dólares y liras italianas.*/
import java.util.Scanner;

public class divisas {
    public static void main(String[] args) {
        float chelines = (float) (956.871 / 100);
        float dragmaxFranco = (float) 22.695;
         /*calculo de dragmas a pesetas
         si 100 dracmas valen 88.607 pesetas y 1 franco frances equivale a 20.110 pesetas entonces 
         un dragma equivale a 0.88607 pesetas entonces 22.695 dragmas equivalen un franco
         22.695 dracmas = 1 franco 
        */
        float dolarxPesetas = (float) 122.499;
        float lirasxPesetas = (float) 9.289 / 100;

        float entrada1,entrada2,entrada3;

        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("chelines a pesetas");
        System.out.println("ingrese el valor en chelines austricacos: ");
        entrada1 = entrada.nextFloat();
        System.out.println( entrada1 + "chelines equivalen a : "+ (entrada1*chelines) + " pesetas");

        System.out.println("Dragmas A Francos");
        System.out.println("ingrese el valor en Dracmas griegos : ");
        entrada2 = entrada.nextFloat();
        System.out.println( entrada2 + " dracmas equivalen a : "+ (entrada2/dragmaxFranco) + " Francos Franceses");


        System.out.println("Pesetas a Dolares");
        System.out.println("ingrese el valor en pesetas : ");
        entrada3 = entrada.nextFloat();
        System.out.println( entrada3 + " pesetas equivalen a : "+ (entrada3/dolarxPesetas) + " Dolares");

        System.out.println("Pesetas a liras");
        System.out.println( entrada3 + " pesetas equivalen a : "+ (entrada3/lirasxPesetas) + " Liras italianas");

    }
}
