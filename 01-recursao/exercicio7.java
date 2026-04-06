/*Modele e implemente um método recursivo que calcule o somatório dos números contidos em um ArrayList de inteiros, passado como parâmetro.
[4, 2, 7, 3] = 4 + 2 + 7 + 3 = 16
*/

import java.util.ArrayList;

public class exercicio7 {
    public static int soma(ArrayList<Integer> lista, int i){

        if (i ==lista.size()){
            return 0;
        }

        return lista.get(i) + soma(lista, i + 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        numeros.add(4);
        numeros.add(2);
        numeros.add(7);
        numeros.add(3);

        int resultado = soma(numeros, 0);

        System.err.println("A soma é: " + resultado);
    }
}
