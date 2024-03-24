public class Game {
    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 100) + 1;
        int palpite = Integer.parseInt(args[0]);

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("O número secreto é " + secretNumber);
        System.out.println("Seu palpite foi: " + palpite);

        if(palpite < secretNumber){
            System.out.println("O numero secreto é maior.");
        } else if(palpite > secretNumber){
            System.out.println("O numero secreto é menor.");
        } else{
            System.out.println("Parabéns! Você acertou o numero secreto.");
        }
    }
}
