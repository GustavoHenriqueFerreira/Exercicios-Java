package EstruturaRepeticao_Aula_1;

public class Exc4_100a5000While {
    public static void main(String[] args) {
        int salario = 100;

        while (salario < 5000) {
            salario += 100;

            System.out.printf("O salário ainda é R$ %d,00;", salario);
        }

        System.out.printf("O salário final é R$ %d,00;", salario);
    }
}
