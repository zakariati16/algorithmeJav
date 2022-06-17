package Tp_SerieValidation.serie1;

import java.util.Scanner;

public class TP4 {
    //Écrire un programme Java qui demande à l’utilisateur de saisir une chaîne de caractères et va mettre en majuscule toutes les premières lettres de chaque mot.
    //Ex :
    //Input : “je suis dans la joie”
    //Résultat : Je Suis Dans La Joie

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Entrez votre phrase : ");
        var str = input.nextLine();
        // transformer le string en chaine en caracteres
        char [] charStr = str.toCharArray();
//ArrayList<Character> strArr= new ArrayList<>();

// si un caractère à la position est un espace, mettre le caractère à la position i+1 en maj




// version initiale

        for (int i = 0; i < str.length()-1; i++) {
            // dans les caracteres ou il y'a espace metrre majuscule en i+1 (lettre apres espace)
            if(charStr[i] == ' '){
                charStr[i+1]= Character.toUpperCase(charStr[i+1]);
                //ici à la possition 0 mettre MAJUSCULE
            } else if (i==0) {
                charStr[i]= Character.toUpperCase(charStr[i]);
            }
        }

        System.out.println(charStr);




    }
}
