public class Aula02 {
    public static void main(String[] args) {
        double temperatura = 25;

        temperatura = (temperatura * 1.8) + 32;

        int temperaturaF = (int) temperatura;

        System.out.println(String.format("A temperatura em Fahrenheit é: %d graus", temperaturaF));
    }
}
