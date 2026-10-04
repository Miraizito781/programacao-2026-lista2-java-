import java.util.Scanner;
public class atv6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade = 80;
        final int IDADE_AVANCADA = 65;
        boolean idoso = (idade >= IDADE_AVANCADA);
        System.out.println("Essa pessoa não é idosa? " + !idoso);
        entrada.close();
    }
}