import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        if(args.length == 0){
            System.out.println("Digite o número da conta: ");
            int account = scanner.nextInt();

            System.out.println("Digite o número da agência: (Formato: xxx-x)");
            String agencyNumber = scanner.next();

            System.out.println("Digite o nome do cliente: ");
            String clientName = scanner.next();

            System.out.println("Digite o saldo: ");
            float balance = scanner.nextFloat();

            String message = "Olá ".concat(clientName)
                    .concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencyNumber)
                    .concat(", conta ").concat(String.valueOf(account))
                    .concat(" e seu saldo ").concat(String.valueOf(balance))
                    .concat(" já está disponível para saque.");

            System.out.println(message);
        }
        else{
            String account = args[0];
            String agencyNumber = args.length > 1 ? args[1] : "desconhecido";
            String clientName = args.length > 2 ? args[2] : "desconhecido";
            String balance = args.length > 3 ? args[3] : "0.0";

            String message = "Olá ".concat(clientName)
                    .concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencyNumber)
                    .concat(", conta ").concat(account)
                    .concat(" e seu saldo ").concat(balance)
                    .concat(" já está disponível para saque.");

            System.out.println(message);
        }
        scanner.close();
    }
}
