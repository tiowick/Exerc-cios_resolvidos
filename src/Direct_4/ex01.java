package Direct_4;

// Faça um progroma que leia conjunto de dois valores
//O primeiro representado o nome do aluno e o segundo representando a sua idade
// (pare o programa inserindo o valor 0 no campo nome)

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {  //
            System.out.println("nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("idade: ");
            idade = scan.nextInt();
        }
        System.out.println("continua aqui...");

    }



}
