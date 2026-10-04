import java.util.Scanner;
public class atv15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade1 = 25;
        int idade2 = 20;
        final int IDADE_MINIMA = 18;
        boolean result = ((idade1 >= IDADE_MINIMA) || (idade2 >=IDADE_MINIMA)) && (idade1 + idade2 > 40);
       System.out.print("Ao menos uma dessas pessoas são maiores de idade? E a idade delas combinadas ultrapassam os 40 anos? " + result);
        entrada.close();
    }
}