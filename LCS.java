public class LCS {
    static int lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];
        int iteracoes = 0;

        long inicio = System.nanoTime();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                iteracoes++;

                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        long fim = System.nanoTime();
        long tempoExecucao = fim - inicio;

        System.out.println("Iteracoes: " + iteracoes);
        System.out.println("Tempo de execucao (ns): " + tempoExecucao);

        return dp[m][n];
    }

    public static void main(String[] args) {
        System.out.println("caso 2 - classico");

        String s1 = "";
        String s2 = " ";
        int resultado = lcs(s1, s2);
        
        System.out.println("string 1: " + s1);
        System.out.println("string 1: " +  s2);
        System.out.println("Tamanho da LCS: " + resultado);
    }
}
