import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, Digite o número da Agência ! ");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.print("Agência: ");
        String agencia = sc.nextLine();

        System.out.print("Nome Cliente: ");
        String nome = sc.nextLine();

        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo de " + saldo + " já está disponível para saque.");

        sc.close();

    }
}
