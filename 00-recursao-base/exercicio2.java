public class exercicio2 {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        
        System.out.println("Resultado é = " + soma(num1, num2));        
    }

    public static int soma(int num1, int num2){
        if (num1 == 0){
            num1 = num2;
            if(num2==0)
                return 0;
            num2=0;
        }

        return  1 + soma(num1-1, num2);
    }

}