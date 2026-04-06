//Modele e implemente um método recursivo que calcule o somatório de um número n (passado como parâmetro) até 0.

public class exercicio2 {
    public static int som(int n){
        if (n==0){
            return 0;
        }
        return n + som(n-1);
    }

    public static void main(String[] args){
        int num = 5;
        System.out.println("Somatorio de " + num + " até 0 é " + som(num));
    }
}
