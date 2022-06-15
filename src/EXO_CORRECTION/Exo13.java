package EXO_CORRECTION;

import java.util.Scanner;
public class Exo13 {
    //E12.
    //Ecrire un programme Java qui permet à l'utilisateur de définir une adresse email et un mot de passe.
    //
    //Ensuite dans un second temps, il sera demandé à l'utilisateur de fournir l'email et le mot de passe:
    //
    //Si l'email et le mot de passe ne correspondent pas aux valeurs définies, le message "Identifiants incorrect devra s'afficher", et l'utilisateur devra recommencer la saisie des valeurs.
    //
    //Sinon, le message "Bienvenu dans votre espace client" devra s'afficher.
    public static void main(String[] args) {
        var input=new Scanner(System.in);
        System.out.print("veuillez saisir une adresse mail: ");
        var adresseMail=input.nextLine();
        System.out.print(" veuillez saisir un mot de passe: ");
        var motDePasse=input.nextLine();



        var valeurMDP="";
        var valeurmail="";
        while(true) {
            System.out.print("rentrer une adresse mail:");
            valeurmail=input.nextLine();
            System.out.print("rentrer votre mot de passe");
            valeurMDP=input.nextLine();

            if (valeurMDP.equals(motDePasse) && valeurmail.equals(adresseMail) ) {
            System.out.println(" Bienvenue dans votre espace client");
            break;
            }

            else {
                System.out.println("indentifiants incorrect");
            }

        }




    }

}