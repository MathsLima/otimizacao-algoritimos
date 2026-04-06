//Modele e implemente um método recursivo que recebe um String em retorna true se este String for um palíndrome, false caso contrário.

public class exercicio5 {
    static boolean isPal(String s) {
        if (s.length() <= 1)
            return true;

        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;

        return isPal(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(isPal("arara"));
        System.out.println(isPal("casa"));
    }
}