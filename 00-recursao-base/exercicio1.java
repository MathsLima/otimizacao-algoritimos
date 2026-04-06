public class exercicio1{
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 4;
        
        System.out.println("Resultado é = " + multiplica(num1, num2));
        
        
    }

    public static int multiplica(int num1, int num2){
        if (num2 == 0){
            return 0;
        }
        return  num1 + multiplica(num1, num2-1);
    }

}