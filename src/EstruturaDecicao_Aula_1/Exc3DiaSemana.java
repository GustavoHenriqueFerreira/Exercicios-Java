package EstruturaDecicao_Aula_1;

import java.text.MessageFormat;
import java.util.Scanner;

public class Exc3DiaSemana {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String[] diasSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

        System.out.print("Digite um número de 1 a 7: ");
        int diaSemana = leitor.nextInt();

        System.out.printf(MessageFormat.format("O dia é {0} e corresponde ao {1}º da semana", diasSemana[diaSemana - 1], diaSemana));
    }
}
