import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("--fatorial--");

        Scanner scan = new Scanner(System.in);
        Fatorial f = new Fatorial();
        System.out.println("Qual numero voce deseja?");
        int n1 = scan.nextInt();
        f.setValor(n1);
        System.out.println(f.getFormula());
        System.out.println(f.getFatorial());
        
    }
}
