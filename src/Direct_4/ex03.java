package Direct_4;

import java.util.Scanner;
/*
Façca um programa que leia 5 numeros
e infome o maior numero
e a média desses numero
 */
public class ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("numero: ");
            numero = scan.nextInt();

            soma = soma + numero;
            System.out.println("soma" + soma);

            if (numero > maior) maior = numero;

            count = count + 1;
            System.out.println("maior : " + maior);
            System.out.println("media" + (soma/5));
        }while(count < 5);
    }
}
