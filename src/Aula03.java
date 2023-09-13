import java.util.Scanner;

public class Aula03 {
    public static void main(String[] args) {
        //condicional
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }

        //Leitura
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println(filme);

        //Loop
        /*Scanner leitura2 = new Scanner(System.in);
        double mediaAvalicao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme  ");
            nota = leitura2.nextDouble();
            mediaAvalicao += nota;
        }
        System.out.println("Média de avaliações " + mediaAvalicao/3);*/

        //Loop com While

        Scanner leitura2 = new Scanner(System.in);
        double mediaAvalicao = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Diga sua avaliação para o filme  ");
            nota = leitura2.nextDouble();

            if (nota != -1) {
                mediaAvalicao += nota;
                totalDeNotas++;
            }
        }
        System.out.println("Média de avaliações " + mediaAvalicao/3);
    }
}
