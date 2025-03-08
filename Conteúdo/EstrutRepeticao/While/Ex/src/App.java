import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);


        // Fatorial
        System.out.println("Digite um numero: ");
        int n = scan.nextInt();
        int cont=n;
        int f=1;

        while(cont>=1){
            f *= cont;
            cont--;
        }
        System.out.println(f);


    }
}
