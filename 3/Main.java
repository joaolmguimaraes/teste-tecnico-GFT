import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<Pessoa> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a idade e o peso da pessoa: ");
            int idade = input.nextInt();
            double peso = input.nextDouble();
            lista.add(new Pessoa(idade, peso));
        }
        calcularMediaPeso(lista);
    }

    public static void calcularMediaPeso(List<Pessoa> lista) {

        double idade10 = 0;
        int count10 = 0;
        double idade20 = 0;
        int count20 = 0;
        double idade30 = 0;
        int count30 = 0;
        double idade30Mais = 0;
        int count30Mais = 0;

        for (Pessoa pessoas : lista) {
            if (pessoas.getIdade() >= 1 && pessoas.getIdade() <= 10) {
                idade10 += pessoas.getPeso();
                count10++;
            } else if (pessoas.getIdade() >= 11 && pessoas.getIdade() <= 20) {
                idade20 += pessoas.getPeso();
                count20++;
            } else if (pessoas.getIdade() >= 21 && pessoas.getIdade() <= 30) {
                idade30 += pessoas.getPeso();
                count30++;
            } else if (pessoas.getIdade() >= 31) {
                idade30Mais += pessoas.getPeso();
                count30Mais++;
            }
        }
        System.out.printf("MÉDIA DE PESOS:" +
                "%n1 a 10 anos: %.2f" +
                "%n11 a 20 anos: %.2f" +
                "%n21 a 30 anos: %.2f" +
                "%nMais de 30 anos: %.2f",
                (idade10 / count10),
                (idade20 / count20),
                (idade30 / count30),
                (idade30Mais / count30Mais));
    }
}