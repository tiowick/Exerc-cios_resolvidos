package Direct_4;

/* Faça um progroma que peça uma nota, entre 0 e dez.
Mostre uma mensagem caso o valor seja invalido.
e continue pedindo.
até que o ususario informe um valor valido.
 */

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("nota :");
        nota = scan.nextInt();

        while(nota <= 0 | nota > 10) {   // Comando while!
            System.out.println("nota ivalida! Digite novamente: ");
            nota = scan.nextInt();

        }



    }
}
