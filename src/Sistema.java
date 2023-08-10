import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {

        int num;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        num = teclado.nextInt();

         while (num % 2 != 0 ) {
             System.out.println("Digite outro número: ");
             if (teclado.hasNextInt()){
                 num = teclado.nextInt();
             } else {
                 System.out.println("Digite um número válido");
             }
         }
    }
}
