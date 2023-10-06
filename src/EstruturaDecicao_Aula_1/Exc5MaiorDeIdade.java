package EstruturaDecicao_Aula_1;

import java.text.MessageFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Exc5MaiorDeIdade {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o ano de nascimento: ");
        int anoNascimento = leitor.nextInt();
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

        // Calcula a idade
        int idade = anoAtual - anoNascimento;

        if (idade >= 18) {
            System.out.printf(MessageFormat.format("Você é maior de idade e possui {0}", idade));
        } else {
            System.out.printf(MessageFormat.format("Você é menor de idade e possui {0}", idade));
        }
    }
}
