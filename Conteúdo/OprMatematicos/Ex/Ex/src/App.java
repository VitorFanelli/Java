import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

       //Ex1 - Calculadora
        System.out.println("------Calculadora------");

        System.out.println("Digite um valor:  ");
        double num = scan.nextFloat();

        double resto = num%2;
        System.out.println("Resto da Divisão por 2:  " + num);

        double cubo = Math.pow(num,3);
        System.out.println("Elevado ao Cubo:  " + cubo);

        double rq = Math.sqrt(num);
        System.out.printf("Raiz Quadrada: %.2f %n " , rq);

        double rc = Math.cbrt(num);
        System.out.printf("Raiz Cúbica: %.2f %n  " , rc);

        double va = Math.abs(num);
        System.out.println("Valor Absoluto: " + va); 

        



    }
}
