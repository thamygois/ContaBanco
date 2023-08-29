import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        /*Deixei o número da conta e saldo como variáveis, pois são dados que, geralmente, o banco possui */
        int numero_conta = 1021;
        double saldo = 237.48;
        
        System.out.println("Olá! Por favor, digite o seu nome:");
            String nomeCliente = scanner.next();

        System.out.println("Insira seu sobrenome:");
            String sobrenomeCliente = scanner.next();

        System.out.println("Por favor, insira o número da agência que deseja abrir uma conta:");
            String agencia = scanner.next();

        
        System.out.println("Agradecemos por abrir uma conta conosco, " + nomeCliente + " " + sobrenomeCliente);
        System.out.println("Sua conta foi aberta na agência " + agencia + "E o número de sua conta é " + numero_conta);
        System.out.println("Seu saldo de " + saldo + "já está disponível para sacar ou realizar Pix! Tenha um ótimo dia.");



scanner.close();    }
}
