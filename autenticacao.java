public class autenticacao{
    public static void main(String[] args) {
        String usuario = "ESTACIO";
        String senha = "centro";

        String usuarioDigitado = "ESTACIO";
        String senhaDigitada = "centro";

        if (usuarioDigitado.equals(usuario) && senhaDigitada.equals(senha)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("ACESSO NEGADO");
        }
    }
}