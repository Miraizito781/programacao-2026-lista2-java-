import java.util.Scanner;
public class q6 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int idade = 30;
        int idade_av = 65;
        // A expressão obrigatoriamente tem de estar entre parenteses
        // pois o operador ! tem prioridade maior que as expressões relacionais >=
        boolean not_Idoso = !(idade  >= idade_av);
        System.out.println("Essa pessoa não é idosa");
    }
}