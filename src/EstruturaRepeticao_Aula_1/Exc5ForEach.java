package EstruturaRepeticao_Aula_1;

import java.util.Arrays;

public class Exc5ForEach {
    public static void main(String[] args) {
        String[] carros = {"fiesta", "onix", "fusca", "saveiro"};

        Arrays.asList(carros).forEach((carro) -> {
            System.out.println(carro);
        });
    }
}
