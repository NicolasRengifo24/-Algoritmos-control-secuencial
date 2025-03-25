package control;
import ejercicios.*;
import java.util.Scanner;


public class main {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Seleccione de 1 a 23");
        int opcion = entrada.nextInt();


        switch (opcion) {
            case 1:
                System.out.println("selecciono el ejercicio alumno");
                Alumno alumno = new Alumno();
                alumno.ejecutar();
                break;
            case 2:
                System.out.println("selecciono el ejercicio Billetes");
                Billetes billetes = new Billetes();
                billetes.ejecutar();
            case 3 :
                System.out.println("selecciono el ejercicio de capital");
                Capital capital = new Capital();
                capital.ejecutar();
            case 4:
                System.out.println("selecciono el ejercicio comerciante");
                Comerciante comerciante = new Comerciante();
                comerciante.ejecutar();
            case 5:
                System.out.println("selecciono el ejercicio divisas");
                Divisas divisas = new Divisas();
                divisas.ejecutar();
            case 6:
                System.out.println("elecciono el ejercicio ecuacion");
                Ecuacion ecuacion = new Ecuacion();
                ecuacion.ejecutar();
            case 7:
                System.out.println("selecciono el ejercicio empresa");
                Empresa empresa = new Empresa();
                empresa.ejecutar();
            case 8:
                System.out.println("selecciono el ejercicio gasolineria");
                Gasolineria gasolineria = Gasolineria();
                gasolineria.ejecutar();
            case 9:
                System.out.println("selecciono el ejercicio hospital");
                Hospital hospital = new Hospital();
                hospital.ejecutar();
            case 10:
                System.out.println("selecciono el ejercicio Luz electrica");
                Luzelectrica luzelectrica = Luzelectrica();
                luzelectrica.ejecutar();
            case 11:
                System.out.println("selecciono el ejercicio Materias");
                Materias materias = new Materias();
                materias.ejecutar();
            case 12:
                System.out.println("selecciono el ejercicio Mayorista");
                Mayorista mayorista = new Mayorista();
                mayorista.ejecutar();
            case 13:
                System.out.println("selecciono el ejercicio Metros ");
                Metros metros = new Metros();
                metros.ejecutar();
            case 14:
                System.out.println("selecciono el ejercicio PlantaProduccion");
                PlantaProductora planta = new PlantaProductora();
                planta.ejecutar();
            case 15:
                System.out.println("selecciono el ejercicio PecioDeVenta");
                PrecioDeVenta precio = new  PrecioDeVenta();
                precio.ejecutar();
            
            
            default:
                System.out.println("Opción no válida. Por favor seleccione un número entre 1 y 23.");
        }


    }
}
