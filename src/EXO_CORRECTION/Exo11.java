package EXO_CORRECTION;

import java.util.Scanner;
public class Exo11 {
    //Exo 11.
    //Écrivez un programme Java qui demande à l'utilisateur d'entrer un nombre
    // et qui ensuite va calculer et afficher la factorielle de ce nombre:
    //Ex:
    //Nombre : 3
    //
    //Factorielle de 3 : 3x2x1 = 6
    //
    //Regle de calcul de factorielle : http://villemin.gerard.free.fr/Denombre/Factorie.htm
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" nombre ?");
        int n = input.nextInt();
        int fact=1;

        for (int i=n;i>0;i=i-1) {
            fact = fact * i;
        }

        System.out.println(fact);
    }
}
