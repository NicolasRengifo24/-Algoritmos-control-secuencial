package ejercicios;
import java.util.Scanner;

/*Un alumno desea saber cuál será su calificación final en la materia de computación. Dicha calificación
se compone de los siguientes porcentajes: 55% del promedio de sus tres calificaciones parciales,
30% de la calificación del examen final y 15% de la calificación de un trabajo final. */



public class Alumno {
    public  void ejecutar(){

        float cal1,cal2,cal3,promedio;
        float examen , trabajo;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el valor de la nota #1 : ");
        cal1 = entrada.nextFloat();

        System.out.println("Ingrese el valor de la nota #2 : ");
        cal2 = entrada.nextFloat();

        System.out.println("Ingrese el valor de la nota #3 : ");
        cal3 = entrada.nextFloat();

        promedio = (float) ((cal1 + cal2 + cal3)/3 * 0.55);
        float promFormat = Math.round(promedio);

        System.out.println("Ingrese el valor del examen final : ");
        examen = entrada.nextFloat();

        examen = (float) (examen * 0.3);

        System.out.println("Ingrese el valor del Trabajo : ");
        trabajo = entrada.nextFloat();

        trabajo = (float) (trabajo * 0.15);

        float notaF = Math.round(promedio+examen+trabajo);

        System.out.println("promedio calificaciones : "+promFormat+"  Examen : "+examen+" Trabajo : "+trabajo);
        System.out.println("Nota Final : "+ notaF);





    }
   

}

