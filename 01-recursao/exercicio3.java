//Modele e implemente um método recursivo que calcule o n-ésimo número da sequência de fibonacci.

public class exercicio3 {
    public static int fibo(int n){
	if (n <= 0)
		return 0;
	if (n==1)
		return 1;
	return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        int num = 3;
        System.out.println("Fibonnaci: " + fibo(num));
    }
}
