import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar números ao usuário
        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();

        // Determinar os limites
        int menor = Math.min(primeiroNumero, segundoNumero);
        int maior = Math.max(primeiroNumero, segundoNumero);

        System.out.println("Números ímpares entre " + menor + " e " + maior + ":");

        // Exibir números ímpares em ordem crescente
        for (int i = menor; i <= maior; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
