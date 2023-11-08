import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner;
        int numero = -1;
        String agencia = "Sem agencia.";
        String nome_cliente = "Sem agencia.";
        BigDecimal saldo = new BigDecimal(-1.0);

        scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome !");
        nome_cliente = scanner.nextLine();
        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da Conta !");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite o saldo !");
        saldo = scanner.nextBigDecimal();
        
        System.out.println("Olá " + nome_cliente +
            ", obrigado por criar uma conta em nosso banco, sua agência é " +
            agencia + ", conta " + numero + " e seu saldo " + saldo +
            " já está disponível para saque.");

        scanner.close();
    }
}
