public class exercicio4 {
    
    public static void main(String[] args) {
        String palavra = "oi";
        System.out.println("A " + palavra + " ao contrario é " + inversao(palavra));        
    }

    public static String inversao(String palavra){
        if (palavra.isEmpty()){
            return palavra;        }
        
        return inversao(palavra.substring(1)) + palavra.charAt(0);
    }
}