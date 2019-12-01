import java.net.SocketOption;

public class ControleFluxoIfElse {
    //estruturas condicionais IF e ELSE
    public static void main(String[] args){
        //idade >15 categoria infantil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >= 18 categoria adulta
        int idade = 15;
        float salario = 2000;
        String categoria;
        if(idade < 15) {
            categoria = "Infantil";
        }else if(idade >= 18){
            categoria = "Juvenil";
        }else{
            categoria = "Adulta";
        }

        System.out.println(categoria);
    }
}
