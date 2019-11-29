public class OperadoresLogicos {
    //Operadores Lógicos
    public static void main(String[] args) {
        /*
        Temos dois tipos de operadores lógicos:
        && = AND Verdadeiro se verdadeiro
        || = OR  Basta uma opção ser veridadeira pra ser veridadeira
         */
        int idade = 18;
        float salario = 1000f;

        System.out.println(idade >= 18 && salario >= 1000);//verdadeiro
        System.out.println(idade >= 18 && salario >= 3000);//falso
        System.out.println(idade >= 18 || salario >= 3000);//verdadeiro
        System.out.println(idade >= 19 || salario >= 3000);//falso
    }
}
