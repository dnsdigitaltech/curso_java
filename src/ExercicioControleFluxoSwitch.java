public class ExercicioControleFluxoSwitch {
    /*
    crie um switch que dado um valor de 1 a 7 considerando 1 Domingo imprima se é dia útil ou final de semana
     */
    public static void main(String[] args){
        //duas formas de fazer
        //1ª, porem nesta estiloa há muita repetição de código
        byte dia = 2;
        /*switch (dia){
            case 1:
                System.out.println("fds");
                break;
            case 2:
                System.out.println("dia útil");
                break;
            case 3:
                System.out.println("dia útil");
                break;
            case 4:
                System.out.println("...");
        }*/
        //2ª forma mais dinamica e escreve mesno
        switch (dia){
            case 1: case 7:
                System.out.println("fds");
                break;
            case 2: case 3: case 4: case 5: case 6:
                System.out.println("dia útil");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
