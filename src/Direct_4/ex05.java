
package Direct_4;
/* Desenvolva um gerador de tabuada;
capaz de gerar tabuada de qualquer numero inteiro, de 1 á 10;
O usuario deve informar qual numero ele deseja ver na tabuada;
a saida deve ser igual conforme abaixo:

tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50

 */

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);
        for(int i = 1; i <= 10 ; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada*i));


        }



    }
}
