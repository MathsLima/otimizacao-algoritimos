public class ex4 {

    public static int mochilaPD(int N, int C, int[] pesos, int[] valores) {

        int[][] maxTab = new int[N + 1][C + 1];
        int iteracoes = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= C; j++) {

                iteracoes++;

                if (pesos[i] <= j) {
                    maxTab[i][j] = Math.max(
                            maxTab[i - 1][j],
                            valores[i] + maxTab[i - 1][j - pesos[i]]
                    );
                } else {
                    maxTab[i][j] = maxTab[i - 1][j];
                }
            }
        }

        System.out.println("Iterações: " + iteracoes);

        return maxTab[N][C];
    }

    public static void main(String[] args) {
        int[] pesos = {0, 2, 3, 4, 5};
        int[] valores = {0, 3, 4, 5, 6};

        int N = 4;
        int C = 5;

        int resultado = mochilaPD(N, C, pesos, valores);

        System.out.println("Melhor valor: " + resultado);

        // outro teste
        int[] pesos2 = {0, 1, 3, 4, 5};
        int[] valores2 = {0, 1, 4, 5, 7};

        int N2 = 4;
        int C2 = 7;

        int resultado2 = mochilaPD(N2, C2, pesos2, valores2);

        System.out.println("Melhor valor: " + resultado2);
    }
}