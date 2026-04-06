//Modele e implemente um método recursivo para encontrar o maior elemento de um ArrayList.

import java.util.ArrayList;

public class exercicio8 {
    public static int findBiggest(ArrayList<Integer> lista, int i){
        if (i == lista.size() - 1){
            return lista.get(i);
        }

        int maiorDoResto = findBiggest(lista, i + 1);

        return Math.max(lista.get(i), maiorDoResto);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        numeros.add(4);
        numeros.add(2);
        numeros.add(7);
        numeros.add(3);

        System.out.println(findBiggest(numeros, 0));
    }
}
