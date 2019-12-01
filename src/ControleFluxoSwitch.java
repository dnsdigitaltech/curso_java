public class ControleFluxoSwitch {
    public static void main(String[] args) {
        //dados os numeros de 1 a 7 imprima os dias da semana
        byte dia = 5;

        /*if(dia == 1){
            System.out.println("Domingo");
        }else if(dia == 2) {
            System.out.println("Segunda");
        }*/

        //quando se tem apenas uma comparação simples detro de um IF e várias alternativas você pode utilizar o SWITCH

        //tipo de dados do SWITCH
        //char, int, byte, short, enum e String
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;

        }
        //char
        char sexo = 'F';
        switch (sexo){
            case 'F':
                System.out.println("Feminino");
                break;
            case 'M':
                System.out.println("Masculino");
                break;
        }
        //String
        String sexoString = "M";
        switch (sexoString){
            case "F":
                System.out.println("Feminino");
                break;
            case "M":
                System.out.println("Masculino");
                break;
        }
        //Default {tanto faz em cima ou em baixo, boa pratica e bom deixar pro utimo}
        String sexoDefault = "Z";
        switch (sexoDefault){
            case "F":
                System.out.println("Feminino");
                break;
            case "M":
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
