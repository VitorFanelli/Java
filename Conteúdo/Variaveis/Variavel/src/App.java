public class App {
    public static void main(String[] args) throws Exception {
        
      /*  Int Byte Long Short
        int n=4;  int n1 =(int)3; Integer num = new Integer(3);
        System.out.println(num); 
      */

      /* Float Double 
        float n1=0f; float n2=(float)0; Float fl = new Float(10);
        System.out.printf("numero : %4f" , fl);
      */

      /*  Char String
        char l1='c'; char l2=(char)'c'; Character ch = new Character('c');
        System.out.println(l1); 
        System.out.println(l2);
        System.out.println(ch);

        String l3="java"; String l4=(String)"Java"; String str = new String("Java");
        System.out.println(l3);
        System.out.println(l4);
        System.out.println(str);
      */

      /* Boolean 
        boolean casado=false; boolean casado1= (boolean)false; Boolean bool = new Boolean(true);
        System.out.println(casado);
        System.out.println(casado1);
        System.out.println(bool);
      */ 

      //  Incompatibilidade  e  Conversao
      int idade=30;
      String valor= Integer.toString(idade);
      System.out.println(valor);

      int id=30;
      float vl = (float) id;
      System.out.println(vl);

      String val="30";
      int ida= Integer.parseInt(val);
      System.out.println(ida);

      String valr="30.5";
      float idad= Float.parseFloat(valr);
      System.out.println(idad);











    }
}
