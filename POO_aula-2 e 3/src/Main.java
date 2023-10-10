import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<PessoaFisica> listPf = new ArrayList<>();
        ArrayList<PessoaJuridica> listaPj = new ArrayList<>();

        System.out.println("Bem vindo ao sistema de cadastro de pessoas Físicas e Jurídicas");

        Scanner leitor = new Scanner(System.in);

        String opcao;

        do {
            System.out.println("Escolha uma das opções: 1 - Pessoa Física, 2 - Pessoa Jurídica, 0 - Sair");

            opcao = leitor.nextLine();

            switch (opcao) {
                case "1":
                    String opcaoPf;
                    do {
                        System.out.println("Escolha uma das opções: 1 - Cadastrar PF, 2 - Listar PF, 0 - Voltar ao menu");
                        opcaoPf = leitor.nextLine();

                        switch (opcaoPf) {
                            case "1":
                                PessoaFisica pessoaFisica = new PessoaFisica();
                                Endereco novoEnderecoPf = new Endereco();

                                System.out.println("Digite o nome: ");
                                pessoaFisica.nome = leitor.next();

                                System.out.println("Digite o CPF: ");
                                pessoaFisica.cpf = leitor.next();

                                System.out.println("Digite o rendimento: ");
                                pessoaFisica.rendimento = leitor.nextFloat();

                                System.out.println("Digite a data de nascimento (dd/mm/aaaa): ");
                                pessoaFisica.dataNascimento = LocalDate.parse(leitor.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                                Period idade = Period.between(pessoaFisica.dataNascimento, LocalDate.now());

                                if (idade.getYears() >= 18) {
                                    System.out.println("Idade válida");
                                } else {
                                    System.out.println("Idade inválida");
                                    break;
                                }

                                System.out.println("Digite o endereço: ");
                                novoEnderecoPf.logradouro = leitor.next();

                                System.out.println("Digite o número: ");
                                novoEnderecoPf.numero = leitor.nextInt();

                                System.out.println("Digite se é comercial (S/N): ");
                                String comercial = leitor.next();

                                if (comercial.toUpperCase().equals("S")) {
                                    novoEnderecoPf.comercial = true;
                                } else {
                                    novoEnderecoPf.comercial = false;
                                }
                                pessoaFisica.endereco = novoEnderecoPf;

                                listPf.add(pessoaFisica);

                                System.out.println("Cadastro realizado com sucesso!");
                                break;

                            case "2":
                                if (!listPf.isEmpty()) {

                                    for (PessoaFisica pessoa : listPf) {
                                        System.out.printf("\nNome: %s", pessoa.nome);
                                        System.out.printf("\nCPF: %s", pessoa.cpf);
                                        System.out.printf("\nData de nascimento: %s", pessoa.dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                                        System.out.printf("\nEndereço: %s - %d", pessoa.endereco.logradouro, pessoa.endereco.numero);
                                        System.out.printf("\nSeu imposto será de R$%f", pessoa.calcularImposto(pessoa.rendimento));

                                        System.out.println();
                                        System.out.println("Aperte ENTER para continuar");

                                        leitor.nextLine();
                                    }
                                } else {
                                    System.out.println("A lista está vazia!");
                                }
                                break;

                            case "0":
                                System.out.println("Voltar");
                                break;
                            default:
                                break;
                        }
                    } while (!opcaoPf.equals("0"));
                    break;

                case "2":
                    String opcaoPj;
                    do {
                        System.out.println("Escolha uma das opções: 1 - Cadastrar PJ, 2 - Listar PJ, 0 - Voltar ao menu");
                        opcaoPj = leitor.nextLine();

                        switch (opcaoPj) {
                            case "1":
                                PessoaJuridica novaPj = new PessoaJuridica();
                                Endereco novoEnderecoPj = new Endereco();

                                System.out.println("Digite o nome: ");
                                novaPj.nome = leitor.nextLine();

                                System.out.println("Digite a razao social: ");
                                novaPj.razaoSocial = leitor.nextLine();

                                System.out.println("Digite o CNPJ: ");
                                novaPj.cnpj = leitor.nextLine();

                                System.out.println("Digite o rendimento: ");
                                novaPj.rendimento = leitor.nextFloat();

                                System.out.println("Digite o endereço: ");
                                novoEnderecoPj.logradouro = leitor.next();

                                System.out.println("Digite o número: ");
                                novoEnderecoPj.numero = leitor.nextInt();

                                System.out.println("Digite se é comercial (S/N): ");
                                String comercial = leitor.next();

                                if (comercial.toUpperCase().equals("S")) {
                                    novoEnderecoPj.comercial = true;
                                } else {
                                    novoEnderecoPj.comercial = false;
                                }

                                novaPj.endereco = novoEnderecoPj;

                                listaPj.add(novaPj);
                                System.out.println("Cadastrado com sucesso!");
                                break;

                            case "2":
                                if (!listaPj.isEmpty()) {
                                    for (PessoaJuridica pessoa : listaPj) {
                                        System.out.printf("\nNome: %s", pessoa.nome);
                                        System.out.printf("\nCNPJ: %s", pessoa.cnpj);
                                        System.out.printf("\nRazão Social: %s", pessoa.razaoSocial);
                                        System.out.printf("\nEndereço: %s - %d", pessoa.endereco.logradouro, pessoa.endereco.numero);
                                        System.out.printf("\nSeu imposto será de R$%f", pessoa.calcularImposto(pessoa.rendimento));

                                        System.out.println();
                                        System.out.println("Aperte ENTER para continuar");

                                        leitor.nextLine();
                                    }
                                } else {
                                    System.out.println("Lista vazia!");
                                }
                                break;
                            default:

                        }
                    } while (!opcaoPj.equals("0"));
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
