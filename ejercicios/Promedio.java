import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        
        int edad1 = 0;
        int edad2 = 0;
        int edad3 = 0;
        double promedio = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la edad1 :");
        edad1 = entrada.nextInt();

        System.out.print("Ingrese la edad2 :");
        edad2 = entrada.nextInt();

        System.out.print("Ingrese la edad3 :");
        edad3 = entrada.nextInt();

        promedio = (edad1+edad2+edad3)/3;

        System.out.println("El promedio es :" + promedio);




    }
}