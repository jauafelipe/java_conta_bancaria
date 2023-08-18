import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Como Você Se chama ?:");
        String nomeClient = s.next();
        String nome = nomeCompleto(nomeClient);
        System.out.println(nome);
        System.out.println("agencia:");
        String agencia = s.next();
        System.out.println("numero:");
        int numero = s.nextInt();
        System.out.println("Saldo:");
        double saldo = s.nextDouble();
        String result = mensagem(nome, numero, agencia, saldo);
        System.out.println(result);
    }

    public static String nomeCompleto(String nome) {
        return "Ola, " + nome.concat(" Preciso Que Me Informe Alguns Dados de Sua Agencia Abaixo");
    }

    public static String mensagem(String nome, int numero, String agencia, double saldo) {
        return "Ola" + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + ", conta "
                + numero + "e seu saldo:" + saldo + "  já estar disponivel para saque";
    }

}
