/*Dada una cantidad en metros, se requiere que la convierta a pies y pulgadas, considerando lo
siguiente: 1 metro = 39.27 pulgadas; 1 pie = 12 pulgadas. */

public class metros {
    public static void main(String[] args) {
        
        int metros = 10;
        float pie = (float) (39.27 / 12);
        float pulgadas = (float) (metros * 39.27);
        float pies = (float) (metros * pie);

        System.out.println( metros + " m en pulgadas es : "+ pulgadas+" y en pies es: "+pies);
    }
}
