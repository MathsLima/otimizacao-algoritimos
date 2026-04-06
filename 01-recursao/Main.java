/*
Implemente um métodos que recebe um String e retorna um ArrayList com todas as permutações deste String.

exemplo:
"abc"

abc
acb
bac
bca
cab
cba
*/
import java.util.ArrayList;

public class Main {

    public static ArrayList<String> permutacoes(String s) {

        ArrayList<String> resultado = new ArrayList<>();

        if (s.length() == 1) {
            resultado.add(s);
            return resultado;
        }

        for (int i = 0; i < s.length(); i++) {

            char atual = s.charAt(i);

            String resto = s.substring(0, i) + s.substring(i + 1);

            ArrayList<String> perms = permutacoes(resto);

            for (String p : perms) {
                resultado.add(atual + p);
            }
        }

        return resultado;
    }

    public static void main(String[] args) {

        ArrayList<String> lista = permutacoes("abc");

        System.out.println(lista);
    }
}
