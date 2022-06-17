package Tp_SerieValidation.serie1;

import java.util.Scanner;

public class TP5 {


        public static void main(String[] args) {

            Scanner input=new Scanner(System.in);
            System.out.println("veuillez saisir votre phrase: ");
            var phrase=input.next();

           // String s = "aaaaak kdqfqklf";
            String s2 = "";

            phrase = phrase.replaceAll("\\s", "");
            s2 = s2.replaceAll("\\s", "");

            for (int i = 0; i < phrase.length(); i++) {
                Boolean found = false;
                for (int j = 0; j < s2.length(); j++) {
                    if (phrase.charAt(i) == s2.charAt(j)) {
                        found = true;
                        break;
                        //don't need to iterate further
                    }
                }
                if (found == false) {
                    s2 = s2.concat(String.valueOf(phrase.charAt(i)));
                }
            }
            System.out.println(phrase);
            System.out.println(s2);
        }
    }



