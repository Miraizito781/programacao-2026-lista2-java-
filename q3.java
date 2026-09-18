import java.util.Scanner;
public class q3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String chuva = "Sim";
        boolean chovendo = ! chuva.equalsIgnoreCase("Sim");
        System.out.println("Está chovendo?" + chovendo);
    }
}