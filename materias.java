/*Calcule y muestre, a un alumno, cuál será su promedio general en las tres materias más difíciles que
cursa y cuál será el promedio que obtendrá en cada una de ellas. Estas materias se evalúan como se
muestra a continuación:
Matemática Examen 90% y 10% del promedio de tres tareas.
Física Examen 80% y 20% del promedio de dos tareas.
Química Examen 85% y 15% del promedio de tres tareas. */
import java.util.Scanner;
public class materias {
    public static void main (String [] args){

        float  examenMat,examenFis,examenQuim,notaMat1 ,notaMat2,notaMat3, notaFis1,notaFis2,notaQuim1,notaQuim2,notaQuim3, promMat,promFis,promQuim;
        Scanner entrada = new Scanner(System.in); 

        System.out.println("Ingrese la nota de la tarea 1 de matematicas: ");
        notaMat1 = entrada.nextFloat();
        System.out.println("Ingrese la nota de la tarea 2 de matematicas: ");
        notaMat2 = entrada.nextFloat();
        System.out.println("Ingrese la nota de la tarea 3 de matematicas: ");
        notaMat3 = entrada.nextFloat();

        System.out.println("Ingrese la nota del examen de matematicas: ");
        examenMat = entrada.nextFloat();

        promMat = (float) ((float) ((notaMat1 + notaMat2 + notaMat3 )/3 * 0.1) + (examenMat * 0.9));

        System.out.println("La definitiva de matematicas es : "+ promMat);

        System.out.println("Ingrese la nota de la tarea 1 de Fisica: ");
        notaFis1 = entrada.nextFloat();
        System.out.println("Ingrese la nota de la tarea 2 de Fisica: ");
        notaFis2 = entrada.nextFloat();
     

        System.out.println("Ingrese la nota del examen de Fisica: ");
        examenFis = entrada.nextFloat();

        promFis = (float) ((float) ((notaFis1 + notaFis2)/2*0.2) + (examenFis * 0.8 ));

        System.out.println("La definitiva de Fisica es : "+ promFis);

        System.out.println("Ingrese la nota de la tarea 1 de Quimica: ");
        notaQuim1 = entrada.nextFloat();
        System.out.println("Ingrese la nota de la tarea 2 de Quimica: ");
        notaQuim2 = entrada.nextFloat();
        System.out.println("Ingrese la nota de la tarea 3 de Quimica: ");
        notaQuim3 = entrada.nextFloat();

        System.out.println("Ingrese la nota del examen de Quimica: ");
        examenQuim = entrada.nextFloat();

        promQuim = (float) ((float) ((notaQuim1 + notaQuim2 + notaQuim3)/3 * 0.15) + (examenQuim * 0.85));

        System.out.println("La definitiva de Quimica es : "+ promQuim);
        
    }
}
