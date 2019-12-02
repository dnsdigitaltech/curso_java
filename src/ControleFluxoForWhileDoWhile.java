public class ControleFluxoForWhileDoWhile {
    public static void main(String[] args){
        int contador = 6;
        //Enquanto
        //no While se for falsa não será executado o bloco de código

        while (contador < 10){
            System.out.println("while " + contador++);
            //contador++; 0 a 9
            //++contador 1 a 10
        }

        //para enquanto
        //no Do while independe de ser falso ou verdadeiro será executado pelo menos uma vez
        contador = 0;
        do{
            System.out.println("dentro do while: " + contador++);
        }while (contador < 10);

        //para ate faça
        //não vai avalidar apenas um instrução
        //for(variavel inicializada; condição; incremento)
        for(int i = 0; i<10; i++){
            System.out.println("valor de i é: " + i);
            if(i==5){
                break;
            }
        }
    }
}
