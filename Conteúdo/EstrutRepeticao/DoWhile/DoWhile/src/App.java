import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
       /* int cont=0;
        do{
            System.out.println("Java" + cont);
            cont++;
        }while(cont<=4); */

        Scanner scan = new Scanner(System.in);
        int num, s=0;
        String resp;

        do{
            System.out.println("Digite um numero: ");
            num = scan.nextInt();
            s += num;
            System.out.println(s);
            System.out.println("Quer continuar? [S/N]");
            resp = scan.next();
            
        }while(resp.equals("S"));

        System.out.println("Soma total: " + s);
        
    }
}
