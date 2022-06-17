package EXO_CORRECTION;

import java.util.Scanner;

public class Exo2 {
    //EXO2 E2.
    //Ecrire un programme Java qui demande à l'utilisateur
    // de saisir la valeur du diamètre, et qui ensuite va effectuer le calcul de la surface.
    //
    //Surface = Rayon x Rayon x PI;
    //Rayon = Diamètre / 2
    public static void main(String[] args) {
float diametre=20f;
float rayon=diametre/2f;
        System.out.println(rayon);
double surface=rayon*rayon*Math.PI;
        System.out.println(surface);

    }
}
