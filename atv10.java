import java.util.Scanner;
public class atv10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1 = 7.5;
        double nota2 = 6.5;
        double nota3 = 5.0;
        final double MEDIA_MINIMA = 6.0;
        System.out.println("O aluno foi aprovado? " + ((nota1 >= MEDIA_MINIMA) && (nota2 >= MEDIA_MINIMA) && (nota3 >= MEDIA_MINIMA)));
        entrada.close();
    }
}
