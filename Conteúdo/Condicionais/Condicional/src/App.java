
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        /* if e else
        System.out.print("Digite sua nota: ");
        int n1= scan.nextInt();
        System.out.print("Digite sua nota: ");
        int n2 = scan.nextInt();
        float media = (n1 + n2)/2;
        System.out.print(media);

        if(media >= 8){
            System.out .println("Parabens!! Voce foi aprovado");
        }else if(media >= 5){
            System.out.println("Recuperacao");
        }else{
            System.out.print("Reprovado");
        }
        */

        // pernas
        System.out.print("Digite a quantidade de pernas: ");
        int p = scan.nextInt();
        String tipo = "";

        switch (p){
            case 1:
                tipo="Saci";
                break;
            case 2: 
                tipo="Bipede";
                break;
            case 4:
                tipo="Quadrupede";
                break;
            case 6: case 8:
                tipo="Aranha";
                break;
            default:
                tipo="ET";
            break;
        }

        System.out.println(tipo);

    }
}
