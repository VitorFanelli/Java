
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        final int MEDIA=60;
        int n1=0, n2=0, n3=0, n4=0, soma=0;
        String nome="", res="";

        System.out.println("Digite seu nome: ");
        nome = scan.nextLine();
        System.out.println("Digite sua nota1: ");
        n1=scan.nextInt();
        System.out.println("Digite sua nota2: ");
        n2=scan.nextInt();
        System.out.println("Digite sua nota3: ");
        n3=scan.nextInt();
        System.out.println("Digite sua nota4: ");
        n4=scan.nextInt();
        soma=n1+n2+n3+n4;

        if(soma>=MEDIA){
            res="Aprovado";
        }else{
            res="Reprovado";
        }

        System.out.printf("Nome do Aluno: %s %n Resultado: %s %n Sua media: %d" ,nome,res,soma);



    }
}
