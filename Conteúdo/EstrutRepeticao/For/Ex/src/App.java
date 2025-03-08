import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---Contador de Valores---");

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o Valor Inicial: ");
        int numInicial= scan.nextInt();
        System.out.println("Digite o Valor Final: ");
        int numFinal = scan.nextInt();
        System.out.println("Digite o Valor do Passo: ");
        int passo = scan.nextInt();
        
        for(int cont=numInicial; cont <= numFinal; cont += passo){
            System.out.println(cont);

        }


    }
}
