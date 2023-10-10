import java.time.LocalDate;

public class PessoaFisica extends Pessoa {
    public String cpf;

    public LocalDate dataNascimento;

    @Override
    public float calcularImposto(float rendimento) {
        /* Até 1500 - isento
        de 1500 a 3500 - 2%
        de 3500 a 6000 - 3.5%
        acima de 6000 - 5% */

        if (rendimento <= 1500) {
            return 0;
        } else if (rendimento <= 3500) {
            return rendimento * 0.02f; // Força a virar float
        } else if (rendimento <= 6000) {
            return rendimento * 0.035f;
        } else {
            return rendimento * 0.5f;
        }
    }
}