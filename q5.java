import java.util.Scanner;
public class q5 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double salario1 = 1850.50;
        double salario2 = 1150.70;
        double valorref = 2100.50;
        boolean comparacao = salario1 >= valorref || salario2 >= valorref;
        System.out.println("Ao menos um dos trabalhadores recebe acima do piso salarial?" + comparacao);
    }
}