public class alturaPeso {
    public static void main(String[] args) {
        double altura = 1.70;
        double peso = 70;

        double imc = peso / (altura * altura);

        if(imc < 18.5){
            System.out.println("Abaixo do Peso");
        } else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("Peso Normal");
        } else if(imc >= 25 && imc <= 29.9){
            System.out.println("Sobrepeso");
        } else if(imc >= 30 && imc <= 39.9){
            System.out.println("Obesidade Tipo I");
        } else {
            System.out.println("Alerta: Obesidade Morbida");
        }
    }
}
