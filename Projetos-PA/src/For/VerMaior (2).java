import java.util.Scanner;

public class VerMaior {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o 1º número: ");
        int maior = entrada.nextInt();

        for (int i = 2; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = entrada.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("Maior valor digitado: " + maior);
        entrada.close();
    }
}
