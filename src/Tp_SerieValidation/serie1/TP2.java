package Tp_SerieValidation.serie1;

import java.util.Scanner;

public class TP2 {
    public static void main(String[] args) {
        //Écrire un programme Java demande à l’utilisateur de saisir un nombre,
        // et qui ensuite affiche le nombre inverse.
        //Ex :
        //Votre nombre : 17
        //Résultat : 71
        //Votre nombre : -89
        //Résultat : -98
        //Votre nombre : -20
        //Résultat : -2(Car le zéro devant un nombre n’est pas pris en compte)

        Scanner input=new Scanner(System.in);

        System.out.printf("saisir un nombre: ");


                int nbr, reste = 0;
                System.out.print("Entrez un nombre à inverser : ");
                Scanner nb = new Scanner(System.in);
                nbr = nb.nextInt();
                while(nbr != 0)
                {
                    reste = reste * 10;
                    reste = reste + nbr%10;
                    nbr = nbr/10;
                }
                System.out.println("L'inverse du nombre est " + reste);
            }
    }




