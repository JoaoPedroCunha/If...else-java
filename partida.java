public class partida {
    public static void main(String[] args) {
        String time1 = "Time A";
        String time2 = "Time B";
        int golstime1 = 2;
        int golstime2 = 3;

        if(golstime1 > golstime2) {
            System.out.println("Vitória do " + time1);
        } else if(golstime1 < golstime2) {
            System.out.println("Vitória do " + time2);
        } else{
            System.out.println("Empate");
        }
    }
}
