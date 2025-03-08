import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       
       /*  // WHile
        int cont=0;
        while(cont<4){
            System.out.println("Java " + (cont + 4)); // (cont + 1 ) - inicia em 1
            cont++;

        }
            // continue - não executa, retorna no início do loop
            // break - joga pra fora do loop, interrompe a execução

        int cont1=0;            
        while(cont1<10){        
            cont1++;
            if(cont1 == 2 || cont1 == 3){
                continue;
            }
            if(cont1==8){
                break;
            }
            System.out.println("java " + cont1); */


           // exercicio
           Scanner scan = new Scanner(System.in);

           System.out.println("Digite o numero a ser repetido: ");
           int cont=0;
           int r=scan.nextInt();

           while(cont <= r){
            System.out.println(cont);
            cont++;
           }

        }
    }

