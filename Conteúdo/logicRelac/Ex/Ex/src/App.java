import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
        // Leitor de Pensamentos 
        Scanner scan = new Scanner(System.in);

        double n =  1 + Math.random() * (6 - 1);
        int valor= (int) n;
      
        System.out.println(" Tente adivinhar o numero de  1 a 5 ");
        int num = scan.nextInt();

        String f1 = "Acertou!!";
        String f2 = "Errou!! Pensei em " + valor;
        String res = (valor == num ) ? f1 : f2;
        System.out.println(res);

        /*if(valor == num){
            System.out.println("Acertou!!");
        }else{
            System.out.println("Errou!! Pensei em " + valor);
        }

        */


    }
}
