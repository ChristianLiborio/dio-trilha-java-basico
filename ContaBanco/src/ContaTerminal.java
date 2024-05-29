import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); 
        
        // Solicita e obtém os dados da conta bancária
        System.out.println("Bem-vindo ao ContaBanco!");
        System.out.println("Por favor, digite o número da sua conta:");
        int numero = scanner.nextInt(); 
        
        scanner.nextLine(); 
        
        System.out.println("Por favor, digite o número da sua agência:");
        String agencia = scanner.nextLine(); 
        
        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine(); 
        
        System.out.println("Por favor, digite o saldo da sua conta:");
        double saldo = scanner.nextDouble(); 
        
       
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ", número da conta " + numero + ", e seu saldo é R$" + saldo + ".");
        
        
        scanner.close();
    }
}
