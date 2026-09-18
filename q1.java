import java.util.Scanner;
public class q1 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a idade do usuário");
        int idade = entrada.nextInt();
        System.out.println("Digite se o usuário possui carteira de motorista");
        String cart = entrada.next();

        boolean dirigir = idade >= 18 && cart.equalsIgnoreCase("sim");
        System.out.println("O usuário pode dirigir? " + dirigir);

    }
}