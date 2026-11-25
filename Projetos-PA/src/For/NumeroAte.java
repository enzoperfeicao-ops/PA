import java.util.Scanner;

public class NumeroAte {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = entrada.nextInt();

        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }

        entrada.close();
    }
}
