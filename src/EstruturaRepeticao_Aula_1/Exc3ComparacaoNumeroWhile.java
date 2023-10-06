package EstruturaRepeticao_Aula_1;

import java.util.Scanner;

public class Exc3ComparacaoNumeroWhile {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Digite um numero: ");
            numero = leitor.nextInt();
        } while (numero != 0);
    }
}
