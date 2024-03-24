public class mediaAluno {
    public static void main(String[] args) {
        String aluno = "Pedro";
        double nota1 = 7.5;
        double nota2 = 8.0;

        double media = (nota1 + nota2) / 2;

        System.out.println("Nome do aluno: " + aluno);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);

        if(media > 7) {
            System.out.println("Aprovado com conceito AAprovado com conceito A");
        } else if(media > 5.0 && media <= 7.0){
            System.out.println("Aprovado com conceito B");
        } else if(media > 4.0 && media <= 5.0){
            System.out.println("Aluno fará avaliação final");
        } else if( media < 4){
            System.out.println("Reprovado");
        }
    }
}
