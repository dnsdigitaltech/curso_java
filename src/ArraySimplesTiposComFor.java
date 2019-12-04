public class ArraySimplesTiposComFor {
    public static void main(String[] args) {
        //valores preechidos para cada tipo se vazio:
        //byte, shot, int, long, float, double = 0
        //char = '\u0000' unicode representando um espaço vazio, será impresso espaço em branco
        //boolean = false
        //reference / String = null
        //ao criar o array defina o tamanho e geralmente este tamanho é fixo
        String[] nomes = new String[3];//criei o espaço na memoria que tem 3 inteiros
        nomes[0] = "Naruto";
        nomes[1] = "Goku";
        nomes[2] = "Luffy";
        for(int i = 0; i < nomes.length; i++){
            System.out.println((i+1) + " nome "+nomes[i]);
        }

    }
}
