package POO_Aula_2;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {
    public String cpf;

    public LocalDate dataNascimento;

    @Override
    public float calcularImposto(float rendimento) {
        if (rendimento <= 1500) {
          return 0;
        } else if (rendimento <= 3500){
            return rendimento * 0.02f; // Força a virar float
        } else if (rendimento <= 6000) {
            return rendimento * 0.035f;
        } else {
            return rendimento * 0.5f;
        }
    }


}
