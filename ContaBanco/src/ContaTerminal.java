import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, informe seu nome para continuar: ");
        String nome = entrada.nextLine();
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = entrada.nextLine();
        System.out.println("Número da conta: ");
        int numero = entrada.nextInt();
        System.out.println("Informe seu saldo: ");
        double saldo = entrada.nextDouble();

        System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +
                " conta "+ numero +" e seu saldo "+ saldo +" já está disponível para saque.");
    }
}
