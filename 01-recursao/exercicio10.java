//Faça um método recursivo que determina o número de dígitos de um inteiro.


public class exercicio10 {
    public static int numDigitos(int n){
        if (n < 10){
            return 1;
        }

        return 1 + numDigitos(n / 10);
    }    

    public static void main(String[] args) {
        System.out.println(numDigitos(12345));
    }
}
