public class ex1 {
    //versao recursiva
    public static long fibRec(int n) {
        if (n <= 1) {
            return n;
        }
        return fibRec(n - 1) + fibRec(n - 2);
    }

    //versao iterativa
    public static long fib(int n) {
        long[] f = new long[n + 1];

        f[0] = 0;
        if (n > 0) {
            f[1] = 1;
        }
    
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

    //versao memoization
    public static long memoizedFibo(int n) {
        long[] f = new long[n + 1];
    
        for (int i = 0; i <= n; i++) {
            f[i] = -1;
        }

        return lookupFibo(f, n);
    }

    public static long lookupFibo(long[] f, int n) {
        if (f[n] >= 0) {
            return f[n];
        }
    
        if (n <= 1) {
            f[n] = n;
        } else {
            f[n] = lookupFibo(f, n - 1) + lookupFibo(f, n - 2);
        }
    
        return f[n];
    }

    public static void main(String[] args) {

        int[] testesPequenos = {4, 8, 16, 32};
        int[] testesGrandes = {128, 1000, 10000};
    
        System.out.println("Fibo Recursivo");
        for (int n : testesPequenos) {
            long inicio = System.currentTimeMillis();
            long resultado = fibRec(n);
            long fim = System.currentTimeMillis();
    
            System.out.println("n=" + n + " resultado=" + resultado + " tempo=" + (fim - inicio) + "ms");
        }
    
        System.out.println("\nFibo Interativo");
        for (int n : testesPequenos) {
            long inicio = System.currentTimeMillis();
            long resultado = fib(n);
            long fim = System.currentTimeMillis();
    
            System.out.println("n=" + n + " resultado=" + resultado + " tempo=" + (fim - inicio) + "ms");
        }
    
        for (int n : testesGrandes) {
            long inicio = System.currentTimeMillis();
            long resultado = fib(n);
            long fim = System.currentTimeMillis();
    
            System.out.println("n=" + n + " resultado=" + resultado + " tempo=" + (fim - inicio) + "ms");
        }
    
        System.out.println("\nFibo Memoized");
        for (int n : testesPequenos) {
            long inicio = System.currentTimeMillis();
            long resultado = memoizedFibo(n);
            long fim = System.currentTimeMillis();
    
            System.out.println("n=" + n + " resultado=" + resultado + " tempo=" + (fim - inicio) + "ms");
        }
    
        for (int n : testesGrandes) {
            long inicio = System.currentTimeMillis();
            long resultado = memoizedFibo(n);
            long fim = System.currentTimeMillis();
    
            System.out.println("n=" + n + " resultado=" + resultado + " tempo=" + (fim - inicio) + "ms");
        }
    }
}
