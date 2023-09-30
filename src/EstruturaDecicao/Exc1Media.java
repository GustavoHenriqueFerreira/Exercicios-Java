package EstruturaDecicao;

import java.util.Scanner;
import java.text.MessageFormat;

public class Exc1Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double primeiraNota = leitor.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double segundaNota = leitor.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;

        if (media >= 6) {
            System.out.printf(MessageFormat.format("Meus parabéns! Sua média foi {0}", media));
        } else {
            System.out.printf(MessageFormat.format("Você não passou. Estude um pouco mais! Sua média foi {0}", media));
        }
    }
}
