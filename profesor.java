
import java.util.Scanner;

/*Un maestro desea saber qué porcentaje de hombres y qué porcentaje de mujeres hay en un grupo
de estudiantes. */

public class profesor {
    public static void main (String[] args){

        int hombres , mujeres , porcHombre , porcMujer ,suma ;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Catidad de Hombres : ");
        hombres = entrada.nextInt();

        System.out.println("Catidad de Mujeres : ");
        mujeres = entrada.nextInt();

        suma = hombres + mujeres;

        porcHombre = (hombres * 100)/ suma;
        porcMujer = (mujeres *100)/suma;

        System.out.println("De "+ suma+ " Estudiantes, hay un "+ porcMujer+"% De Mujeres y un "+porcHombre+"% De Hombres");

    }
}
