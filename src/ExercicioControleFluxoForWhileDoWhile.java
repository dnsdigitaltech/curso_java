public class ExercicioControleFluxoForWhileDoWhile {
    public static void main(String[] args) {
        //imprima todos os numeros pares de 0 até 100000
        int valor = 100000;
        for(int i =0; i<=valor; i++){
            //if(i%2==0){//numero pares
            if(i%2!=0){//numero impares
                System.out.println(i);
            }
        }
    }
}
