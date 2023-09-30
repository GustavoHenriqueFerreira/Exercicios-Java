package EstruturaDecicao;

import java.util.Scanner;

public class Exc4Login {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome de usuário: ");
        String usuario = leitor.next();

        System.out.println("Digite a senha: ");
        String senha = leitor.next();

        if (usuario.equals("admin123") && senha.equals("senha123")){
            System.out.print("Login bem-sucedido!");
        } else {
            System.out.print("Nome de usuário ou senha incorretos.");
        }
    }
}
