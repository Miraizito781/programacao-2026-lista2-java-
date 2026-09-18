import java.util.Scanner;
public class q7 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma unidade de medida de temperatura");
        double temp = entrada.nextDouble();
        System.out.println("Digite unidade de medida de umidade");
        double umid = entrada.nextDouble();
        double tempRef = 60.5;
        double umidRef = 30.7;
        boolean queimada = temp >= tempRef && umid >= umidRef;
        System.out.println("De acordo com a temperatura e umidade informadas, é possível ocorrer uma queimada?" + queimada);
        entrada.close();
    }
}