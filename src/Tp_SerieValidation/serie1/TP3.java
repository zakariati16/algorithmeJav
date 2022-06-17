package Tp_SerieValidation.serie1;

import java.util.Scanner;
public class TP3 {
    // Ecrire un programme Java demande à l’utilisateur de saisir 2 chaines de caractères
    // et qui ensuite renseigne si ce sont des anagrammes.

    //Qu'est-ce qu'une anagramme ?

    //Une anagramme est un mot ou un groupe de mots obtenu en changeant de place les lettres d'un autre mot
    // ou groupe de mots.
    //Par exemple, "GARE" est une anagramme de "RAGE", ou "GARE MAMAN" est une anagramme de "ANAGRAMME".



    public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            // demander à l'utilisateur de saisir le premier string
            System.out.print("saisir la premiere chaine de caractere : ");
            String s1 = scanner.nextLine();

            System.out.print("saisir la deuxieme chaine de caractere : ");
            String s2 = scanner.nextLine();

            if (checkAnagram(s1, s2))
                System.out.println(s1 + " est une anagramme de " + s2 );
            else
                System.out.println(s1 + " n'est pas une anagramme de " + s2 );


        }

        public static boolean checkAnagram(String s1, String s2)
        {
            // supprimez tous les espaces blancs des strings s1 et s2,
            // en passant la chaîne à la méthode replaceAll()
            // et convertissez-les en minuscules en appelant toLowerCase()

            s1 = s1.replaceAll("\\s", "").toLowerCase();
            s2 = s2.replaceAll("\\s", "").toLowerCase();

            // Check length of both strings
            // la premiere condition
            if (s1.length() != s2.length())
                return false;
            else
            {
                for (int i = 0; i < s1.length(); i++)
                {
                    for (int j = 0; j < s2.length(); j++)
                    {
                        if (s1.charAt(i)==s2.charAt(j))
                        {
                            // renvoyer la nouvelle chaine de s2 avec la fonction substring
                            s2 = s2.substring(0, j) + s2.substring(j + 1);
                            break;
                        }
                    }
                }
// la deuxieme condition
                if (s2.length() == 0)
                {
                    return true;
                } else
                {
                    return false;
                }
            }
        }
   }

