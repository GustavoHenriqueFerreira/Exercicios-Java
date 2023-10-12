import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Livro {
    String titulo;
    float preco;

    public Autor autor;

    public LocalDate dataLancamento;

    ArrayList<Livro> listaLivros = new ArrayList<>();

    public int verificarTempoLancamento(LocalDate dataLancamento){
        return Period.between(dataLancamento, LocalDate.now()).getYears();
    };

    public void cadastrarLivro() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do autor: ");
        String nomeAutor = leitor.nextLine();

        System.out.println("Digite a local de nascimento do autor: ");
        String localNasc = leitor.nextLine();

        System.out.println("Digite o titulo do livro: ");
        titulo = leitor.nextLine();

        System.out.println("Digite o preço do livro: ");
        preco = leitor.nextFloat();

        System.out.println("Digite a data de lançamento do livro (dd/mm/aaaa): ");
        dataLancamento = LocalDate.parse(leitor.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        autor = new Autor(nomeAutor, localNasc); // Crie uma instância de Autor

        if (verificarTempoLancamento(dataLancamento) >= 5) {
            System.out.println("Válido, o livro possui mais de 5 anos de lançamento");
            listaLivros.add(this);
        } else {
            System.out.println("Inválido! Por favor informe um livro que tenha mais de 5 anos de lançamento");
        }
    }

    public void listarLivros() {
        System.out.println("\nLivros cadastrados: ");

        if (listaLivros.size() > 0) {
            for (Livro livro : listaLivros) {
                System.out.printf("\nTítulo: %s", livro.titulo);
                System.out.printf("\nPreço: %s", livro.preco);
                System.out.printf("\nData de lancamento: %s", livro.dataLancamento);
                System.out.printf("\nNome autor: %s - %s", livro.autor.nomeAutor, livro.autor.localNasc);
                System.out.printf("\nTempo de lançamento do livro: %d anos", livro.verificarTempoLancamento(livro.dataLancamento));

                System.out.println();
                System.out.println("Aperte ENTER para continuar");
            }
        } else {
            System.out.println("A lista está vazia!!!");
        }
    }
}
