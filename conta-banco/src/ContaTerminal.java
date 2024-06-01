import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, insira o número da conta: ");
        int conta = sc.nextInt();
        sc.nextLine(); 

        System.out.println("Por favor, insira o número da agência: ");
        String agencia = sc.nextLine();

        System.out.println("Por favor, insira o nome do cliente: ");
        String nome = sc.nextLine();

        System.out.println("Por favor, insira o saldo da conta: ");
        double saldo = sc.nextDouble();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
