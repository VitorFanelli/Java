import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        // Equação do Segundo Grau
      /*System.out.println("Digite o valor de a: ");
        float a = scan.nextFloat();
        System.out.println("Digite o valor de b: ");
        float b = scan.nextFloat();
        System.out.println("Digite o valor de c: ");
        float c = scan.nextFloat();
        float delta = (float) Math.pow(b,2) - 4*a * c;
        System.out.printf("Reulatado: %.2f %n" , delta);

        if(delta<0){
            System.out.println("Nao existe reizes reais");
        }else{
            System.out.println("Existem raizes reais");
        }
      */

        // Tipos de Triângulos
        System.out.println("Digite o valor do segmento a: ");
        float a = scan.nextFloat();;
        System.out.println("Digite o valor do segmento b: ");
        float b = scan.nextFloat();
        System.out.println("Digite o valor do segmento c: ");
        float c = scan.nextFloat();

        if((a < b+c) && (b < c+a) && (c < a+b)){                      
            System.out.println("Triangulo"); 
            if(a==b && b==c){
                System.out.println("Tipo: Equilatero");
            }else if (a!=b && b!=c && c!=a){
                System.out.println("Tipo: Escaleno");
            }else{
                System.out.println("Tipo: Isosceles");
            } 
        }else{                                                          
            System.out.println("Nao e triangulo");
        }

 

    }
}
 //Equilatero - A==B && B==C
 //Isoseles - dois lados iguais e um diferente
 //Escaleno - todos lados diferentes