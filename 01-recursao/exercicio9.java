/*Implemente um método recursivo para determinar se um string ocorre dentro de outro.
exemplo:
texto = "programacao"
padrao = "gram"

programacao
gram

rogramacao
gram

ogramacao
gram

gramacao
gram
*/

public class exercicio9 {
    public static boolean ocorre(String palavra, String padrao){
        
        if (palavra.length() < padrao.length()){
            return false;
        }
        
        if(palavra.startsWith(padrao)){
            return true;
        }

        return ocorre(palavra.substring(1), padrao);
    }

    public static void main(String[] args) {
        System.out.println(ocorre("programacao", "gram"));
    }
}
