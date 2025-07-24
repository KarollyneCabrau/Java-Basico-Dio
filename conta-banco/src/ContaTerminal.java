import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitação dos dados
        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        // Exibir mensagem final
        System.out.printf(
            "\nOlá %s, obrigado por criar uma conta em nosso banco.\n" +
            "Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.\n",
            nomeCliente, agencia, numero, saldo
        );

        scanner.close();
    }
}