public class ControleFluxoContinue {
    public static void main(String[] args) {
        //seguinte problema
        //tem um valor do carro e quer descobrir quantas vezes poderá parcelar este carro
        //porém a regra é que as parcelas deve ser maior que 1000
        //dado um valaor de um carro, descubra quantas vezes ele poderá dser parcelado,
        // porem as parcelas não poderá ser menores do que 1000

        double valorTotal = 30000;
        //faremos uma logica inversa
        for(int parcela = (int) valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;
            if(valorParcela <= 1000){
                continue;
            }else{
                System.out.println("Parcela " + parcela + " R$" + valorParcela);
            }
        }
    }
}


