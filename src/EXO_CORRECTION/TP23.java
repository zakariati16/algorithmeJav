package EXO_CORRECTION;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class TP23 {
    public static void main(String[] args) {


//        TP 23.
//Ecrire un programme Java qui permet à l'utilsation de déclarer 2 tableaux:
//1 tableau correspondant au numéro du jour de la semaine(ex : 1 pour Lundi)
//1 tableau correspondant au nom des jours de la semaine(Ex : Lundi)
//Associer les 2 informations dans un HashMap
//Permettre à l'utilisation d'associer via un HasMap le numéro correspondant au jour et le jour de la semaine correspondant.
//Pour les jours de la semaine et le numéros correspondant, veuillez stocker les données dans des Set(recherche sur internet)

        Scanner input = new Scanner(System.in);

        ArrayList<String> days = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>();

        var day = "";
        var number = 0;

        for (int i = 0; i <= 6 ; i++)
        {
            System.out.println("Veuillez entrer un jour de la semaine : ");

            day = input.nextLine();

            days.add(day);
        }

        for (int i = 0; i <= 6 ; i++)
        {
            System.out.printf
                    ("Veuillez entrer le numero correspondant a %s (entre 1 et 7) : ",days.get(i));

            number = input.nextInt();

            numbers.add(number);
        }

        System.out.println();
        System.out.println(days);
        System.out.println(numbers);

        LinkedHashMap<String, Integer> Week = new LinkedHashMap<>();

        for (int i = 0; i < days.size(); i++)
        {
            number = numbers.get(i);

            day = days.get(i);

            Week.put(day,number);

        }
        System.out.println();
        System.out.println(Week);



        }
    }







