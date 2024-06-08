import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Imput/Output 'número da conta'
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        //  Imput 'Agência'
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Imput/Output 'nome do cliente'
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Imput/Output 'Saldo'
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                        + "sua agência é " + agencia + ", conta " + numero 
                        + " e seu saldo " + saldo + " já está disponível para Saque.";
        
        System.out.println(mensagem);

        scanner.close();
    }
}
