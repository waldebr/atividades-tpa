import java.util.Scanner;

public class ExercicioNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibir todos os números pares entre 4 e 4000
        System.out.println("Números pares entre 4 e 4000:");
        for (int i = 4; i <= 4000; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //  Executar a tabuada do número informado pelo usuário
        System.out.print("Informe um número para a tabuada: ");
        int numero = scanner.nextInt();
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        System.out.println();

        //  Exibir a quantidade de números entre 4000 e 6000
        int quantidade = 0;
        for (int i = 4001; i < 6000; i++) {
            quantidade++;
        }
        System.out.println("Quantidade de números entre 4000 e 6000: " + quantidade);
        
        // Somar os números ímpares entre valores informados pelo usuário
        System.out.print("Informe o valor inicial: ");
        int valorInicial = scanner.nextInt();
        System.out.print("Informe o valor final: ");
        int valorFinal = scanner.nextInt();

        int somaImpares = 0;
        for (int i = valorInicial; i <= valorFinal; i++) {
            if (i % 2 != 0) {
                somaImpares += i;
            }
        }
        System.out.println("Soma dos números ímpares entre " + valorInicial + " e " + valorFinal + ": " + somaImpares);

        scanner.close();
    }
}
