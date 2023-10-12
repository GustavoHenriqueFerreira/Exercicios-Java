import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livro metodoLivro = new Livro();

        System.out.println("Bem vindo ao sistema de cadastro de Livros");

        Scanner leitor = new Scanner(System.in);

        String opcao;

        do {
            System.out.println("Escolha uma das opções: 1 - Cadastrar Livro, 2 - Listar Livros, 0 - Sair");

            opcao = leitor.nextLine();

            switch (opcao) {
                case "1":
                    metodoLivro.cadastrarLivro();

                    System.out.println("Cadastrado com sucesso!");
                    break;

                case "2":
                    metodoLivro.listarLivros();
                    leitor.nextLine();
                    break;

                case "0":
                    System.out.println("Obrigado por usar nosso sistema");
                    break;

                default:
                    System.out.println("Digite um valor válido!");
                    break;
            }
        } while (!opcao.equals("0"));
    }
}