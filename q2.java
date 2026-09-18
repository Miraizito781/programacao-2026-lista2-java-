import java.util.Scanner;
public class q2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a idade do usuário");
        int idade = entrada.nextInt();
        System.out.println("Digite se o usuário tem permissão dos pais");
        String aut = entrada.next();

        boolean autorizacao = aut.equals("sim")|| idade >= 18;
        System.out.println("O usuário tem autorização para entrar nesse evento.");
        
    }
}