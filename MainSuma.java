import java.util.Scanner;
public class MainSuma{ 
    public static void main(String[] args){
        Scanner op = new Scanner(System.in);
        int a,b,c;

         System.out.println("ingresa un numero entero");

         a=op.nextInt();

         System.out.println("ingresa otro numero entero");

         b=op.nextInt();

         Operacion evaluar = new Operacion();
         evaluar.p= a;
         evaluar.s= b;
         evaluar.resultado= a+b;
         evaluar.mostrarResultado();
    }

}