/*Calcule el área de un triángulo en función de las longitudes de sus lados, utilizando la fórmula:
√p(p­a)(p­b)(p­c) donde p = (a+b+c) / 2 */

public class triangulo {
    public static void main(String[] args) {
        
        int a = 3;
        int b = 4;
        int c = 5;

        int p = (a+b+c)/2;

        int area = (int) Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.println("el area es de "+ area);



    }
}
