import java.util.Scanner;

public class Exo17 {
    public static void main(String[] args) {
        // TP 17.
        //Ecrire un programme Java demande à l'utilisateur de saisir un text et qui ensuit,
        // retourne la chaine inverse.
        //
        //Exp :Votre chaine : mamy
        //Résultat : ymam

        Scanner input=new Scanner(System.in);
        System.out.print("veuillez saisir votre text: ");
        var text=input.next();

        var newText = "";

        for (int i = text.length()-1 ; i >= 0 ; i--)
        {
            newText = newText + text.charAt(i);
        }
        System.out.printf("Le texte inverse est : %s", newText);;
        }




    }

