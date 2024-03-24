public class Main {
    public static void main(String[] args) {
        int velocidade = 60;
        
        if (velocidade >= 120) {
            System.out.println("Voando!");
        } else if (velocidade >= 80) {
            System.out.println("Acima da velocidade");
        } else if (velocidade == 60) {
            System.out.println("Velocidade Permitida");
        }
    }
}
