package POO_Aula_2;

public class PessoaJuridica extends Pessoa {
    public String cnpj;

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
