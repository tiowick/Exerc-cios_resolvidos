package Direct_4;

public class ex07_array {
    public static void main(String[] args) {
        // ordem inversa;

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        System.out.println("Vetor: ");
        int count = 0;
        while(count < (vetor.length)){
            System.out.print(vetor[count] + " ");
            count++;

        }

        System.out.println("\n Vetor: ");
        for (int i = (vetor.length - 1); i >= 0; i --) {
            System.out.print(vetor[i] + " ");
        }


    }
    }
