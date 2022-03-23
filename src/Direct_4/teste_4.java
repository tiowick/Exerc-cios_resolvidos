package Direct_4;

public class teste_4 {

    public static void main(String[] args) {

        ifSemflecha();
        ifferias();
        ifMenor();
        switchsemana();
        switchNumero();
        switchFerias();

    }

    private static void switchFerias() {

        String mes = "dezembro";
        switch (mes) {
            case "dezembro" :
            case "julho" :
            case "janeiro" :
                System.out.println("Ferias!");
                break;
            default:
                System.out.println("Mes indefinido!");
                break;
        }
    }

    private static void switchNumero() {

        int numero = 4;
        switch(numero){
            case 1:
            case 2:
            case 3:
                System.out.println("certo!");
                break;
            case 4:
                System.out.println("errado!");
                break;
            case 5:
                System.out.println("talvez!");
                break;
            default:
                System.out.println("Valor indefinido!");
                break;

        }
    }

    private static void switchsemana() {
        String dia = "terça";
        switch (dia){
            case "segunda":
                System.out.println(2);
                break;
            case "terça" :
                System.out.println(3);
                break;
            case "quarta":
                System.out.println(4);
                break;
            case "quinta":
                System.out.println(5);
                break;
            case "sexta":
                System.out.println(6);
                break;
            case "sabado":
                System.out.println(7);
                break;
            case "domingo" :
                System.out.println(8);
                break;
            default:
                System.out.println(9);
                System.out.println("dia invalido!");
                break;
        }
    }

    private static void ifMenor() {

        // Melhorar os Ifs;
        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;


        if ((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes)){   // Situação em que se deve ser evitada !;
            System.out.println("Funcionario deve receber auxilio!");                       //
        }
        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo) && (muitosDependentes)){
            System.out.println("Funcionario deve receber auxilio!");
        }

        boolean recebeAuxilio = ((salarioBaixo) && (muitosDependentes));
        if (recebeAuxilio){
            System.out.println("Funcionario deve receber auxilio!");
        }else {
            System.out.println("Funcionario não deve receber auxilio!");
        }
    }

    private static void ifferias() {

        // Jeito não recomendado;
        String mes = "julho";
        if (mes == "julho" || mes == "Dezembro" || mes == "Fervereiro") {
            System.out.println("Ferias!");
        }
    }

    private static void  ifSemflecha() {

        // jeito recomendado;
        int mes = 9;
        if (mes == 1){
            System.out.println("janeiro");
        } else if (mes== 2) {
            System.out.println("Fervereiro");
        } else if (mes == 3) {
            System.out.println("março");
        } else if (mes == 4) {
            System.out.println("Abril");
        }else if (mes == 5) {
            System.out.println("Maio");
        }else if (mes == 6) {
            System.out.println("junho");
        } else if (mes == 7) {
            System.out.println("Julho");
        }else if (mes == 8) {
            System.out.println("Agosto");
        }else if (mes == 9) {
            System.out.println("Setembro");
        }else if (mes == 10) {
            System.out.println("Outubro");
        }else if (mes == 11){
            System.out.println("Novembro");
        }else if (mes == 12) {
            System.out.println("Dezembro");
        }













    }
}
