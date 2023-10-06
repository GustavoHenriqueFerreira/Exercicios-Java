package EstruturaDecicao_Aula_1;

import java.util.Scanner;

public class Exemplo2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); //entrada de dados

        System.out.print("Digite um número: "); //saída de dados
        double numero = Double.parseDouble(leitor.nextLine());

        System.out.print("Digite outro número: "); //saída de dados
        double segundoNumero = Double.parseDouble(leitor.nextLine());

        if(segundoNumero == numero){
            /*console.log(`O ${numero} é positivo`);*/
            //String msg = MessageFormat.format("O {0} é {1}", numero, "positivo");
            System.out.print("Iguais");
        } else {
            //String msg = MessageFormat.format("O {0} é {1}", numero, "neutro");
            System.out.print("Diferentes");
        }
    }
}
