public class ArraysSimples {
    public static void main(String[] args) {
        //temos dois tipode de variáveis em java primitivo e references (objetos)
        //Os arrays sempre usam references
        //qualquer array em java é considerado um objeto
        //int [] idade é a variável re referencia
        //Toda vez que você for criar um array objeto é necessário passar o tamamnho, ex: [3] 3 posições
        //Só irá utilizar  palavra new type quando utilizar array, pois a plaavra new é usada para criar objetos
        int [] idades = new int[3];
        //idades[0] = 20f;//erro de compilação
        idades[1] = 15;
        idades[2] = 30;
        //se declarou 3 posições é obrigado a usar 3 posições
        //idades[3] = 45;

        System.out.println("idade 1: " + idades[0]);
        System.out.println("idade 2: " + idades[1]);
        System.out.println("idade 3: " + idades[2]);

    }
}
