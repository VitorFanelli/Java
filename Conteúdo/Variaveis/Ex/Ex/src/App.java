import java.util.Scanner;
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        // Soma
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        float n1=scan.nextFloat();
        System.out.println("Digite um numero: ");
        float n2=scan.nextFloat();
        float rest= n1+n2;
        System.out.println(rest);
         */

       // Idade 
       Scanner scan = new Scanner(System.in);
       LocalDate data = LocalDate.now();
       System.out.println("Digite seu ano de nascimento: ");
       int nascimento = scan.nextInt();
       int atual= data.getYear();
       int idade = atual - nascimento;
       System.out.println(idade);
        
    }
}
