import java.util.Scanner;
public class atv2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade = 18;
        boolean autorizacao = false;
        boolean temPermissao = (idade >= 18) || autorizacao;
        System.out.println("A pessoa pode entrar no evento? "  + temPermissao);
        entrada.close();
        }
    }

