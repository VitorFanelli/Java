import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(0);
        lista.add(0);
        lista.add(0);
        lista.add(0);
        System.out.println("Lista Atual ");
        for(int l: lista){
           
            System.out.println(l);
        }

        // Modificar
        System.out.println("Deseja modificar? [S/N]");
        String respMod = scan.next();
        String respMod1;

        if(respMod.equals("S")){
            do{
                System.out.println("Digite a Posicao");
                int posMod = scan.nextInt();
                System.out.println("Digite o Valor");
                int novoVal = scan.nextInt();
                lista.set( posMod, novoVal);
                System.out.println("Deseja alterar outro Valor? [S/N]");
                respMod1= scan.next(); 
            }while(respMod1.equals("S"));  
        }
        System.out.println("Lista Atual ");
        for(int l: lista){
        
        System.out.println(l);
        }

        // Zerar
        System.out.println("Deseja zerar alguma Posicao? [S/N]");
        String respZerar = scan.next();
        String respZerar1;

        if(respZerar.equals("S")){
            do{
                System.out.println("Digite a Posicao");
                int posZerar = scan.nextInt();
                lista.set(posZerar, 0);
                System.out.println("Deseja Zerar outra Posicao? [S/N]");
                respZerar1 = scan.next();
            }while(respZerar1.equals("S"));
        }
        System.out.println("Lista Atual ");
        for(int l: lista){
            System.out.println(l);
        }


        //Remover 
        System.out.println("Deseja Remover alguma Posicao? [S/N]");
        String respRemover = scan.next();
        String respRemover1;

        if(respRemover.equals("S")){
            do{
                System.out.println("Digite a Posicao");
                int posRemover = scan.nextInt();
                lista.remove(posRemover);
                System.out.println("Deseja Remover outra Posicao? [S/N]");
                respRemover1 = scan.next();
            }while(respRemover1.equals("S"));
        }
        System.out.println("Lista Atual ");
        for(int l: lista){
            
            System.out.println(l);
        }

        
        // Ordem
        System.out.println("Deseja Colocar em Ordem? [S/N]");
        String respOrdem= scan.next();
        String respOrdem1;

        if(respOrdem.equals("S")){
            Collections.sort(lista);
        }
        System.out.println("Lista Atual ");
        for(int l: lista){
            
            System.out.println(l);
        }













        

    }
}
