import java.util.Scanner;
public class atv16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int hora = 22;
        final int INI_HORA_C = 8;
        final int FIM_HORA_C = 18;
        boolean foraHoraComercial = !((hora >= INI_HORA_C) && (hora <= FIM_HORA_C));

        System.out.print("O horário informado está fora do horário comercial? " + foraHoraComercial);
        entrada.close();
    }
}
