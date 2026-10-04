import java.util.Scanner;
public class atv7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double temp = 94.5;
        double umid = 14.2;
        final double TEMP_REF = 90.0;
        final double UMID_REF = 20.5;
        System.out.println("A temperatura e umidade atual favorecem a propagação de uma queimada? " + ((temp >= TEMP_REF) && (umid <= UMID_REF)));
        entrada.close();
    }
}