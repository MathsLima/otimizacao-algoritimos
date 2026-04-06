//Modele e implemente um método recursivo que recebe um inteiro zero ou positivo e retorna um String com o número em binário.

/*
exemplo: 13 -> 1101
13 / 2 = 6  resto 1
6 / 2 = 3   resto 0
3 / 2 = 1   resto 1
1 / 2 = 0   resto 1
*/

public class exercicio6 {
    public static String convBase2(int n){
        if(n<2){
            return "" + n;
        }

        return convBase2(n / 2) + (n % 2);
    }

    public static void main(String[] args){
        System.out.println(convBase2(13));
    }
}
