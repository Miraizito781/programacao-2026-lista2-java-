import java.util.Scanner;
public class atv12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota = 5.0;
        final double MEDIA_MINIMA = 4.0;
        boolean ent_Trabalhos = false;
        System.out.println("O aluno está em recuperação? " + (((nota < MEDIA_MINIMA)) && !ent_Trabalhos));
        entrada.close();
    }
}