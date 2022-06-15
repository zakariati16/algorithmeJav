import java.util.Scanner;

public class exo18 {
    //Entrez un text : non
    //
    //Résultat : non est un palindrome
    //
    //Entrez un text : oui
    //
    //Résultat : oui n'est pas un palindrome
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("veuillez saisir votre text: ");
        var text = input.next();
        var newtext = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            newtext = newtext + text.charAt(i);
        }
        if (text.equalsIgnoreCase(newtext)) {
            System.out.printf("%s est un palindrome\n",text);
        } else {
            System.out.printf("%s n'est pas un palindrome\n",text);
        }
    }
}
