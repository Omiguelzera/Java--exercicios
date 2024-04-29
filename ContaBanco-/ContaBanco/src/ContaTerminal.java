import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       /*  Variaveis  
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo; */

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome : ");
        String nomeCliente = scanner.next();

            System.out.println("Digite o número da conta : ");
            int numeroConta = scanner.nextInt();
        
                System.out.println("Digite a agencia de seu banco: ");
                String agencia = scanner.next();

                        System.out.println("Saldo de sua conta: ");
                        double saldo = scanner.nextDouble();
        
        
        System.out.println("Olá " + nomeCliente + 
                           "\nObrigado por criar uma conta em nosso banco"+
                           "\nSua Agência é : " + agencia+ 
                           "\nConta : " + numeroConta + 
                           "\nSeu saldo : " + saldo + " " + "já esta diponivel para saque.");
    }
}
