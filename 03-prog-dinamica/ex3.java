public class ex3 {

    public static int mochilaForcaBruta(int[] pesos, int[] valores, int capacidade) {
        int n = pesos.length;
        int melhorValor = 0;
        int iteracoes = 0;

        int total = (int) Math.pow(2, n);

        for (int i = 0; i < total; i++) {
            int pesoTotal = 0;
            int valorTotal = 0;

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    pesoTotal += pesos[j];
                    valorTotal += valores[j];
                }
            }

            iteracoes++;

            if (pesoTotal <= capacidade && valorTotal > melhorValor) {
                melhorValor = valorTotal;
            }
        }

        System.out.println("Iterações: " + iteracoes);
        return melhorValor;
    }

    public static void main(String[] args) {
        int[] pesos = {2, 3, 4, 5};
        int[] valores = {3, 4, 5, 6};
        int capacidade = 5;

        int resultado = mochilaForcaBruta(pesos, valores, capacidade);

        System.out.println("Melhor valor: " + resultado);

        // Outro teste
        int[] pesos2 = {1, 3, 4, 5};
        int[] valores2 = {1, 4, 5, 7};
        int capacidade2 = 7;

        int resultado2 = mochilaForcaBruta(pesos2, valores2, capacidade2);

        System.out.println("Melhor valor: " + resultado2);
    }
}