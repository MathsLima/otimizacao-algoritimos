//Modele e implemente um método recursivo que calcule o fatorial de um número n passado como parâmetro.

public class exercicio1 {
    public static int fatorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n * fatorial(n-1);
    }

    public static void main(String[] args){
        int num = 5;
    System.err.println("Fatorial de "+ num + " é: " + fatorial(num));
    }
}
