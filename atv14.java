import java.util.Scanner;
public class atv14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean possuiRG = false;
        boolean possuiCPF = false;
        boolean possuiComp = false;
        System.out.println("A pessoa possui a documentação necessária para realizar um cadastro? " + ((possuiRG) && (possuiCPF) && (possuiComp)));
        entrada.close();
    }
}