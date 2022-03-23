package Direct_4;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;

        System.out.print(fatorial + " ! = ");
        for (int i  = fatorial ; i >= 1 ; i -- ){
            multiplicacao = multiplicacao * 1;

        }

        System.out.print(multiplicacao);
    }
}
