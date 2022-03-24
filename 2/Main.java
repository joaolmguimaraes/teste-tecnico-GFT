import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");

        int incomoda = input.nextInt();

        System.out.printf("Um elefante incomoda muita gente. %d elefante(s) ", incomoda);

        for (int i = 0; i < incomoda; i++) {
            System.out.print("incomoda(m) ");
        }

        System.out.println("muito mais.");

    }
}
