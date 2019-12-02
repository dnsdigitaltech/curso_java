public class ControleFluxoBreak {
    //break Continue
    public static void main(String[] args) {
        //seguinte problema
        //tem um valor do carro e quer descobrir quantas vezes poderá parcelar este carro
        //porém a regra é que as parcelas deve ser maior que 1000
        //dado um valaor de um carro, descubra quantas vezes ele poderá dser parcelado,
        // porem as parcelas não poderá ser menores do que 1000

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++){
            double valorParcela = valorTotal / parcela;
            /*if(valorParcela >= 1000) {
                System.out.println("Parcela " + parcela + " R$" + valorParcela);
            }else {
                System.out.println("Saindo do laço");
                break;
            }
            System.out.println("fora do laço");*/

            //melhorando o código
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);
        }
    }
}
