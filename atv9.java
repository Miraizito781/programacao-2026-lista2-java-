import java.util.Scanner;
public class atv9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vagasEst = 20;
        boolean naolotado = !(vagasEst == 0);
        System.out.println("O estacionamento não está lotado? " + naolotado);
        entrada.close();
    }
}