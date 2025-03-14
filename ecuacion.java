/*  
    aX + bY = c
    dX + eY = f 
    
     ce - bf        af - cd
 X = --------- Y = ---------  calcule y muestre el valor de X e Y.
     ae – bd        ae – bd
    
    
*/

public class ecuacion {
    public static void main(String[] args) {
    
        double a = 5, b = 4,d = 7;
        double e= 3, c = 20, f = 10;
        double x , y;
        

        x = ((c*e)-(b*f))/((a*e)-(b*d));

        y = ((a*f)-(c*d))/((a*e)-(b*d));

        System.out.println("X = " + x);
        System.out.println("Y= " + y);

        
        System.out.println((a*x) + (b*y));


    }
}
