/*Calcule qué tanto por ciento anual cobraron por un préstamo de Bolívares X, si se pagaron Bolívares
Y de intereses en 4 años. La fórmula del interés es:
    

        Capital. Tiempo. Razón
I = ------------------------------
                100          


razon =     100*i
        ---------------
        capital * tiempo
*/

public class prestamo {
    public static void main(String[] args) {
        
        int capital = 10000;
        int tiempo = 4; 
        double razon ;
        int interesesPagados = 500;
        
        razon = (double) (100*interesesPagados) / (double)  (capital * tiempo); 

        System.out.println(razon);



    }
}
