import java.util.Scanner;
public class atv8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String temCadastro = "Sim";
        boolean cadastro = (temCadastro.equalsIgnoreCase("sim"));
        String temCupom = "Sim";
        boolean cupom = (temCupom.equalsIgnoreCase("sim"));
        System.out.println("O cliente pode receber algum benefício nesta compra? " + (cadastro || cupom));
        entrada.close();
    }
}