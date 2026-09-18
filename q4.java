import java.util.Scanner;
public class q4 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double n1 = 6.0;
        double n2 = 5.0;
        double media_minima = 6.0;
        boolean aprovado = n1 >= media_minima && n2 >= media_minima;
        System.out.println("O aluno foi aprovado? " + aprovado);
    }
}

