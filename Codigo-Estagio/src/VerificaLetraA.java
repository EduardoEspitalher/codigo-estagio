import java.util.Scanner;

public class VerificaLetraA {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira uma string
        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        // Inicializa a variável que armazenará a contagem de ocorrências da letra 'a'
        int contagem = 0;

        // Percorre cada caractere da string
        for (int i = 0; i < entrada.length(); i++) {
            // Verifica se o caractere atual é 'a' ou 'A'
            if (entrada.charAt(i) == 'a' || entrada.charAt(i) == 'A') {
                contagem++; // Incrementa a contagem
            }
        }

        // Exibe o resultado
        if (contagem > 0) {
            System.out.println("A letra 'a' aparece " + contagem + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        scanner.close();
    }
}
