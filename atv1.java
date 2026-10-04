
import java.util.Scanner;

public class atv1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Você possui carteira de motorista?");
        String carteira = entrada.next();
        System.out.println("Você possui quantos anos?");
        int idade = entrada.nextInt();
        boolean aptoDirigir = (carteira.equalsIgnoreCase("Sim"));
        boolean maiorIdade = (idade >= 18);
        System.out.println("O usuário está apto a dirigir? " + (aptoDirigir && maiorIdade));
    }
}
