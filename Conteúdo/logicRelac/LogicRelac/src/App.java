import java.util.Scanner;
import java.time.Year;

public class App {
    public static void main(String[] args) throws Exception {
       

        // ternario ?
        /*  int num=1;
         int num1=3;
         int r= (num == num1) ? num1 : num;
         System.out.println(r);

         String nome1="Jesus";
         String nome2 = new String("Jesus");
         String result = (nome1.equals(nome2)) ? "Igual" :  "Diferente"; // .equals() - compara o conteúdo
         System.out.println(result); */

         // Relacionais
          // < 
          // >
          // <=
          // >==
          // ==
          // !=


        // Logicos
         // &&
         // ||
         // ^ - ou exclusivo
         // !

         //Verficador maior de idade
         
         Scanner scan = new Scanner(System.in);
          
        System.out.println("Digite seu ano de nascimento: ");
        int nasc= scan.nextInt();
        int atual = Year.now().getValue();
        int idade = atual - nasc;
        System.out.println(idade);
        String maiorIdade= (idade >= 18) ? "Maior de Idade" : "Menor de idade";


    }
}
