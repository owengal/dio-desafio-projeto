import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar e ler um número inteiro
        System.out.print("Digite o número de sua agência: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        // Solicitar e ler uma string
        System.out.print("Digite sua agência: ");
        String agencia = scanner.nextLine();

        // Solicitar e ler o nome completo
        System.out.print("Digite seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        // Solicitar e ler o saldo
        System.out.print("Digite seu saldo: ");
        double saldo = 0.0;
        while (true) {
            try {
                saldo = scanner.nextDouble();
                break; // Sair do loop se a entrada for válida
            } catch (InputMismatchException e) {
                System.out.println("Saldo inválido. Por favor, digite seu saldo utilizando vírgula.");
                scanner.next(); // Limpar a entrada inválida
            }
        }

        // Fechar o scanner
        scanner.close();

        // Imprimir os valores da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

}}
