import java.util.ArrayList;
import java.util.Scanner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Exo21TableauDynamique {
    public static void main(String[] args) {
        //Ecrire un programme Java demande à l'utilisateur de saisir  liste de langages de programmations
        // à partir du clavier.
        // Une fois le tableau rempli, l'utilisateur sera appelé à saisir les noms des langages qu'il souhaite
        // retirer de liste.
        // Le programme devra ensuite retirer ces langages et afficher l'état du tableau avant et après la suppression.

                Scanner input = new Scanner(System.in);

                ArrayList<String> langagesDeProgrammation = new ArrayList<String>();
                // System.out.println("Taille du tableau : " + langagesDeProgrammation.size());


                while (true) {

                    System.out.println("Entrer une langage de programmation :");
                    String langage = input.nextLine();
                    //Cette méthode permet de vérifier si la chaîne est vide ou si elle ne contient que des caractères d'espacements
                    if (langage.isBlank() && !langagesDeProgrammation.isEmpty()) {
                        break;
                    } else {
                        langagesDeProgrammation.add(langage);//0
                    }
                }


                System.out.println("Avant suppresion ");
                System.out.println(langagesDeProgrammation);


                while (true) {

                    System.out.println("Entrer un language de programmation a supprimer:");
                    String langageASupprimer = input.nextLine();
                    if (langageASupprimer.isBlank()) {
                        break;
                    } else {
                        // if (langagesDeProgrammation.contains(langageASupprimer)) {

                        if ( langagesDeProgrammation.remove(langageASupprimer)) {
                             langagesDeProgrammation.remove(langageASupprimer) ; //0

                        } else {
                            System.out.printf("le tableau ne contient pas le langage %s \n", langageASupprimer);
                        }
                    }

                    System.out.println("Apres suppression");
                    System.out.println(langagesDeProgrammation);


                }

            }
        }

