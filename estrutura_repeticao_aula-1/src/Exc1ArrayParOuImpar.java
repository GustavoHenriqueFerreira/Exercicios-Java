public class Exc1ArrayParOuImpar {
    public static void main(String[] args) {
        String[] professores = {"Alana", "Aléxia", "Jéssica", "Odirlei", "Possarle", "Samanta", "Thiago"};

        for (int i = 0; i < professores.length; i++) {
            if (i == 0){
                System.out.printf("O número de índice do(a) professor(a) %s é zero%n", professores[i]);
            } else if (i % 2 == 0){
                System.out.printf("O número de índice do(a) professor(a) é %d, ou seja %s é par%n", i, professores[i]);
            } else {
                System.out.printf("O número de índice do(a) professor(a) é %d, ou seja %s é ímpar%n", i, professores[i]);
            }
        }
    }
}
