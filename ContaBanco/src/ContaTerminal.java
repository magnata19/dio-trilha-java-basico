import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da sua conta. Ex: 1234");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência. Ex: 123");
        int numeroAgencia = scanner.nextInt();
        System.out.println("Digito: ");
        int digitoAgencia = scanner.nextInt();

        System.out.println("Por favor, nos informe seu nome.");
        String nomeCliente = scanner.next();

        System.out.println("Nos informe seu saldo.");
        double saldoCliente = scanner.nextDouble();

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia
                        + "-" + digitoAgencia + ", conta " + numeroConta + " e seu saldo R$" + saldoCliente + " já está disponível para saque.");
    }
}
