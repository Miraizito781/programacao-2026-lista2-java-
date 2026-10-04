import java.util.Scanner;
public class atv5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario1 = 560.0;
        double salario2 = 750.2;
        final double SALARIO_MEDIO = 600;
        System.out.println("Algum dos dois salários é superior a media salarial da área? " + ((salario1 > SALARIO_MEDIO) || (salario2 > SALARIO_MEDIO)));
        entrada.close();
    }
}