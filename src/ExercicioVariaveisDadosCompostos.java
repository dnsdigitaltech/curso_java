public class ExercicioVariaveisDadosCompostos {
    /*
    Crie um algoritmo que possua as variaveis nome, salario, sexo(M ou F), idade, estado civil
    Imprima da seguinte forma:
    O trabalhador(a) <nome> do sexo <sexo>, idade <idade>, estado civil <estadoCivil> e salario <salario> encontra-se empregado neste estabelecimento.
     */
    public static void main(String[] args){
        String nome = "Alan Silva";
        String salario = "3000";
        char sexo = 'M';
        int idade = 35;
        String estadoCivil = "Casado";
        System.out.println("O trabalhador " +nome+ " do sexo " +sexo+ ", idade " + idade + " estado civil " +estadoCivil+ " e salario " +salario+ " encontra-se empregado neste estabelecimento");
    }
}

