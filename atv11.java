import java.util.Scanner;
public class atv11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int estoqProd1 = 20;
        int estoqProd2 = 0;
        System.out.println("Algum desses produtos está em falta? " + ((estoqProd1 == 0) || (estoqProd2 == 0)));
        entrada.close();
    }
}