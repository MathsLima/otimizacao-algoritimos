public class exercicio3 {
    public static void main(String[] args) {
    float num1 = 3;
    
    System.out.println("Resultado é = " + soma(num1));        
}

public static float soma(float num1){
    if (num1 == 0){
        return 0;
    }

    return  1/num1 + soma(num1-1);
}
}