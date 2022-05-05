import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String senha = "2018";
        String senhaDigitada = "";

        Scanner input = new Scanner(System.in);

        while (!senha.contentEquals(senhaDigitada)) {

            System.out.println("Digite a senha: ");
            senhaDigitada = input.nextLine();

            if (senha.contentEquals(senhaDigitada)) {
                System.out.println("Acesso garantido");
            } else {
                System.out.println("Senha inválida");
            }
        }

    }
}
