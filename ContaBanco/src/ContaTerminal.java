import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Seja Bem-vindo(a)! ");

        System.out.println("Por favor, digite o número da agência ! :");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta ! :");
        String numeroConta = scanner.next();

        System.out.println("Por favor, digite o seu nome ! :");
        String nomecliente = scanner.next();

        System.out.println("Por favor, digite o seu sobrenome ! :");
        String sobrenomecliente = scanner.next();

        System.out.println("Por favor, digite o saldo ! :");
        double saldo = scanner.nextDouble();

        //concatenando em uma unica string o nome e o sobrenome do cliente
        nomecliente = nomecliente + " " + sobrenomecliente;

        System.out.println("Olá " +nomecliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " +agencia+ ", conta " +numeroConta+ " e seu saldo " +saldo+ " já está disponível para saque " );
    }

}
