public class App {
    public static void main(String[] args) throws Exception {
       
       // Operadores: +  -  *  /  %  \


       //Incremento e Decremento - Pré e Pós
       // +=  -=  *=  /=  %=
       int n1=5;
       System.out.println(n1++); //Pós - usa a variavel depois incremneta
       System.out.println(++n1); //Pré - incrmenta depois usa a variavel

       // Math - PI
       float pi = (float) Math.PI;
       System.out.println(pi);

       // Math - pow - exponenciação
       int exp = (int) Math.pow(2,2);
       System.out.println(exp);

       // Math - sqrt - Raiz Quadrada
       float rq = (float) Math.sqrt(4);
       System.out.println(rq);

       // Math - cbrt - Raiz Cubica
       float rc= (float) Math.cbrt(27);
       System.out.println(rc);

       // Math - abs - Valor Absoluto
       int va = Math.abs(-3);
       System.out.println(va);

       // Math - floor - Arredonda p/ baixo
       float apb = (float) Math.floor(4.9);
       System.out.println(apb);

       // Math - ceil - Arredonda p/ cima
       float apc = (float) Math.ceil(4.1);
       System.out.println(apc);

       // Math - round - Arrendonda Aritméticamnete
       float a1 = (float) Math.round(3.8);
       System.out.println(a1);
       float a2 = (float) Math.round(3.2);
       System.out.println(a2);

       // Math - random - Gerador de números
       // random - entre 0.0 e 1.0
       float rdm = (float) Math.random();
       System.out.println(rdm);

       // random - escolhe os numeros
       double rdm1 = 5 + Math.random() * (10-5)  ;
       System.out.println(rdm1);

       double rdm2 = 15 + Math.random() * (50-15)  ;
       System.out.println(rdm2);

       
       

    }
}