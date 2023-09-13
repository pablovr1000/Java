import java.util.Random;
import java.util.Scanner;

public class desafioJogoAdivinhacao {
    public static void main(String[] args) {
        int number = new Random().nextInt(100);
        int number2 = 0;
        int attempts = 0;

        while (attempts != 5) {
            Scanner reading = new Scanner(System.in);
            System.out.println("Bem vindo ao jogo da adivinhação, digite um número entre 0 e 100 e tente adivinha-lo: ");
            number2 = reading.nextInt();

            if (number2 == number) {
                System.out.println("Parabéns, você acertou na tentativa de número " + attempts);
                break;
            } else if (attempts == 4) {
                System.out.println("Pouxa, acabaram as tentativas, mais sorte na próxima, o número era " + number);
                break;
            } else if (number2 < number) {
                System.out.println("O número digitado é menor do que o número gerado, tente mais uma vez");
                attempts++;
            } else {
                System.out.println("O número digitado é maior do que o número gerado, tente mais uma vez");
                attempts++;
            }
        }
    }
}
