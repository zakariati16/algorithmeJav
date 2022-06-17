package Tp_SerieValidation.serie1;


import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

    public class TP1 {
        // Écrire un programme Java permet de déclarer un tableau d’entiers en Java,
        // et qui ensuite va afficher le plus grand nombre, sa position; le plus petit nombre, et sa position.
        //
        //Dans l’affichage, il faut afficher le tableau en format [element1, element2,...,elementN],
        // et dans l’affiche du plus grand nombre faire afficher le text(PG) et pour le plus petit(PP):
        //Ex :
        //Tb : [ 12,3,5,6,-3 ]
        //Résultat:
        //Tb : [12(PG) , 3, 5, 6, -3(PP)]
        //Plus grand : 12
        //Plus petit : -3
        public static void main(String[] args) {


            System.out.println("Entrer la taille du Tableau :");
            var input = new Scanner(System.in);
            int taille = input.nextInt();
            int[] tableEntier = new int[taille];
            String[] tableCara = new String[taille];




            for (int i = 0; i < taille; i++) {
                System.out.printf("table[%d]:", i);
                tableEntier[i] = input.nextInt();
                tableCara[i] = tableEntier[i] + "";

            }

            int maxNum = tableEntier[0];
            int minNum = tableEntier[0];
            int PPG=0;
            int PPP=0;
            for (int i = 0; i < taille; i++) {
                if (tableEntier[i] > maxNum ) {
                    maxNum = tableEntier[i];
                    PPG = i;
                    tableCara[i] = tableEntier[i] + " (PG) ";


                } else if ( tableEntier[i] < minNum){
                    minNum = tableEntier[i];
                    PPP=i;
                    tableCara[i]=tableEntier[i] + " (PP) ";
                }

            }
            System.out.println(Arrays.toString(tableEntier));
            System.out.println(Arrays.toString(tableCara));
            System.out.println("PG :" +maxNum);
            System.out.println("PP :" +minNum);

            System.out.println("PPG :" +PPG);
            System.out.println("PPP :" +PPP);

        }
    }





