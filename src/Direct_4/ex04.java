package Direct_4;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");

        quantNumeros = scan.nextInt();


        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if (numero % 2 == 0) quantPares++; // quantPares = quantPares +1;
            else quantImpares++; // quantImpares = quantImpares +1;

           //count = count +1;
            count++;
        } while(count < quantNumeros);

        System.out.println("quatidade par: " + quantPares);
        System.out.println("quatidade impar: " + quantImpares);


    }
}
