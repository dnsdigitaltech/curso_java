import java.awt.image.ShortLookupTable;
import java.net.SocketOption;

public class ControleFluxoTernario {
    //estruturas condicionais Ternário
    public static void main(String[] args) {
        //Quando usa-se um IF e ELSE voĉe poderá substituir por um Ternário
        int idade = 18;
        String status;
        /*if (idade < 18) {
            status = "Não Adulto";
        } else {
            status = "Adulto";
        }*/

        status = idade < 18 ? "Não Adulto" : "Adulto";

        System.out.println(status);

        int idade2 = 18;
        //Operadores ternários mais complexos
        //idade2 >15 categoria infantil
        //idade2 >= 15 && idade < 18 categoria juvenil
        //idade2 >= 18 categoria adulta
        //OBS não é recomendado usar ternário com mais de duas intruções pois fica um pouco complicado de entender
        String status2;
        status2 = idade2 < 15 ? "infantil" : idade2 >= 15 && idade2 < 18 ? "Juvenil" : "Adulta";
        System.out.println(status2);
    }
}
