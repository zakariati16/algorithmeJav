package EXO_CORRECTION;

import java.util.Scanner;

public class Exo14While {
    //E13.
    //A l'exercice précédent, s'ajoute un nouveau requirement:
    //
    //Le nombre de fois que l'utilisateur peut saisir des mauvais identifiants est limité à 5,
    // ensuite le programme va s'arrêter avec un message disant.
    //
    //"Vous avez saisi des mauvais identifiants x fois, votre compte est bloqué".
    //
    //
    //
    //Il faut dire à au user le nombre de tentatives restants
    public static void main(String[] args) {

        var input = new Scanner(System.in);


        System.out.println("Saisissez un code pin");




        System.out.println("Veuillez definir un email et un mot de passe  :");
        System.out.println("email :");
        var email=input.nextLine();
        System.out.println("Mot de passe");
        var codePin=input.nextLine();


        System.out.println("*************************");
        System.out.println("** espace candidat ** ");
        System.out.println("*************************");

        String codeATester="";
        String emailATester="";
        int i=0;

        System.out.println("Entrez vos identifiants pour acceder a votre espace personnel verrouiller votre telephone ");
        while (true){



            System.out.println("votre email :");
            emailATester=input.nextLine();
            System.out.println("votre mot de passe :");
            codeATester=input.nextLine();



            if (codeATester.equals(codePin) && emailATester.equals(email) ){
                System.out.println("Bienvenu dans votre espace client  ");
                break;
            } else {

                if (i < 4) {
                    i=i+1;
                    System.out.printf("Vous avez saisi des mauvais identifiants %d fois, il vous reste %d tentatives \n .", i, 5 - i);
                } else {
                    System.out.println("Vous avez saisi des mauvais identifiants 5 fois, votre compte est bloqué.");
                    break;
                }


            }
        }


    }

}