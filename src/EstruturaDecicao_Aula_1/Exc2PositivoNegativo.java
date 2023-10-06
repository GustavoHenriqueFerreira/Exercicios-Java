package EstruturaDecicao_Aula_1;

import java.text.MessageFormat;
import java.util.Scanner;

public class Exc2PositivoNegativo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in); //entrada de dados

        System.out.print("Digite um número: "); //saída de dados

        double numero = leitor.nextDouble();

        if(numero > 0){
            /*console.log(`O ${numero} é positivo`);*/
            String msg = MessageFormat.format("O {0} é {1}", numero, "positivo");
            System.out.printf(msg);
        } else if (numero == 0) {
            String msg = MessageFormat.format("O {0} é {1}", numero, "neutro");
            System.out.printf(msg);
        }
        else {
            String msg = MessageFormat.format("O {0} é {1}", numero, "negativo");
            System.out.printf(msg);
        }
    }
}
