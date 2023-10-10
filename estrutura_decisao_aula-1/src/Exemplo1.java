import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in); //entrada de dados

        System.out.print("Digite seu salário"); //saída de dados

        //double salario = Double.parseDouble(leitor.nextLine());
        double salario = leitor.nextDouble(); //pega a localidade, ou seja 9.9 vira 9,9

        if (salario < 1000) {
            double salarioAtualizado = salario * 1.1;
            System.out.println(salarioAtualizado);
        } else {
            System.out.println("Salário sem reajuste");
        }
    }
}
