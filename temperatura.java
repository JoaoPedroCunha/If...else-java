public class temperatura {
    public static void main(String[] args) {
        double temperatura = 38.0;

        if(temperatura <= 37.0 ) {
            System.out.println("Temperatura normal");
        } else if(temperatura <= 37.8) {
            System.out.println("Febril");
        } else if(temperatura <= 38.5) {
            System.out.println("Febre Leve");
        } else if(temperatura <= 39.9) {
            System.out.println("Febre Moderada");
        } else {
            
        }
    }
}
