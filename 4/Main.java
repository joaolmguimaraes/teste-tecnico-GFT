import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(menu());
        int op = input.nextInt();
        double altura;
        double peso;
        switch (op) {
            case 1:
                System.out.println("A soma é " + soma());
                break;
            case 2:
                System.out.println("Digite o peso: ");
                peso = input.nextDouble();
                System.out.println("Digite a altura: ");
                altura = input.nextDouble();
                categoriaIMC(calcularIMC(peso, altura));
                break;
            case 3:
                break;
            default:
                System.out.println("Opção inválida. Programa encerrado.");
        }


    }

    public static String menu() {
        return String.format("Menu de opções:%n" +
                "1. Soma%n" +
                "2. IMC%n" +
                "3. Sair%n" +
                "Digite a opção desejada: %n");
    }

    public static double soma() {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite os números: ");
        double N1 = input.nextDouble();
        double N2 = input.nextDouble();

        return N1 + N2;


    }

    public static double calcularIMC(double peso, double altura) {

        return peso / (altura * altura);
    }
    public static void categoriaIMC(double IMC) {

        if (IMC < 18.5) {
            System.out.println("Peso abaixo do normal");
        } else if (IMC >= 18.5 && IMC <= 25.0) {
            System.out.println("Peso normal");
        } else if (IMC > 25.0 && IMC <= 30.0) {
            System.out.println("Sobrepeso");
        } else if(IMC > 30.0 && IMC <= 35)    {
            System.out.println("Grau de Obesidade I");
        }
    }
}
