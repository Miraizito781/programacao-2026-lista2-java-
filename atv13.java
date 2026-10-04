import java.util.Scanner;
public class atv13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double velocidade = 430.0;
        final double VELOCIDADE_MAXIMA = 350.0;
        boolean infracao = (velocidade > VELOCIDADE_MAXIMA);
        System.out.println("O motorista não está cometendo infração? " + !infracao);
        entrada.close();
    }
}