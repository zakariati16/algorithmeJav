package Cours_bases_Java;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTable {
    public static void main(String[] args) {
        // le hashmap se caracterise avec sa cle
        // pas de duplicata dans le hashmap
        // on peut fusionner deux hashmap different avec la methode putAll
        // exp langage putall (langages2) = comme ca on aurra une seule hashmap avec les valeurs des deux hashmap
        // il existe d'autre methodes pour travailler sur le hashmap
        // comme get set (pour rennommer o remplacer une valeur) et remmove pour supprimer
            var input=new Scanner(System.in);

            System.out.print("Combien de langages souhaitez-vous ajouter?");
            int nombreDeLangages=input.nextInt();

            input.nextLine();
            HashMap<String,String> langages=new HashMap<>();
            for(int i=1;i<=nombreDeLangages;i++){
               if(i==1){
                   System.out.printf("Insérer le %der langage : ",i);
                }else{
                    System.out.printf("Insérer le %dème langage : ",i);
                }
                String langage=input.nextLine();
                langages.put(langage,langage);
            }
            System.out.println(langages);

            System.out.println("Quel langage souhaitez-vous supprimer ? ");
            String langageASupprimer=input.nextLine();
            langages.remove(langageASupprimer);

            System.out.println("Après la suppression");
            System.out.println(langages);
        }
    }

