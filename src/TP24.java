public class TP24 {
///TP 24.
//Ecrire une méthode Java qui prend en paramètre 2 string et qui ensuite retourne un booléen(true/false) selon que le 2ème string est le préfixe du premier ou pas.

//Ex :
//isPrefix("banner", "bang")
//> false
//
//isPrefix("hugging", "hug")
//> true
    static boolean isPrefix(String word, String prefix) {
        for (int i = 0; i< prefix.length(); i++) {
            if (prefix.charAt(i) != word.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println();
String word1="banner";
String word2="ban";
boolean word12=isPrefix(word1,word2);
        System.out.println("ispreefixe: ("+word1+" "+word2+")");

        System.out.println(isPrefix(word1,word2));
}

}

