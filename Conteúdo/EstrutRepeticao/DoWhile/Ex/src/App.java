import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner scan = new Scanner(System.in);
       
        int num;
        int s=0;
        int cont=0;
        int par=0;
        int impar=0;
        int checarParImpar;
        int maior100=0;
        int checar100;
        float media;
        

        
        do{
            System.out.println("Digite um numero:  (0 interrompe)");
            num=scan.nextInt();
        
           
            checarParImpar= (num % 2 ==0) ? par++ : impar++;

            checar100= (num > 100 ) ? maior100++ : maior100;

            cont++;
            s +=num;
           
            

           
        }while(num != 0);
        
        cont--;
        par--;

        //media depois de tirar o 0 do cont
        media= s/cont;


        
        System.out.println("Total de Valores: " + cont);
        System.out.println("Soma dos Valores: " + s);
        System.out.println("Total de Valores Pares: " + par);
        System.out.println("Total de Valores Impares: " + impar);
        System.out.println("Total de Valores acima de 100: " + maior100);
        System.out.println("Media dos Valores: " + media);   
        

      /*   int n, s=0;
        int media;
        int cont=0;
        String resposta;

        do{
            System.out.println("Digite um numero: ");
            n = scan.nextInt();
            cont++;
             s += n;
             media=s/cont;
            System.out.println("Quer continuar? [S/N]");
            resposta= scan.next();
        }while(resposta.equals("S"));
            System.out.println("Soma: " + s);
            System.out.println(cont);
            System.out.println("Media: " + media);     
            
            
*/            
            
            
       
            
            
            
            
    }
}
