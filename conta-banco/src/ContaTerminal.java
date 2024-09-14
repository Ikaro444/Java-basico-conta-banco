import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite sua conta:");
        int conta = scanner.nextInt();

        System.out.println("Digite sua agencia:");
        String agencia = scanner.next();

        System.out.println("Digite seu nome completo:");
        String nome = scanner.next();

        System.out.println("Insira seu saldo inicial:");
        double saldo = scanner.nextDouble();

        //Imprimindo os dados imputados pelo usuário
        System.out.println("Olá " + nome + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$" + saldo + " já está disponível para saque");

    }
}
