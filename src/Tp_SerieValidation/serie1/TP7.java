package Tp_SerieValidation.serie1;

import java.util.Arrays;

public class TP7 {

    ///Écrire une méthode Java qui prend en paramètre un tableau de caractères.
    //Et qui va ensuite retourner un nouveau tableau avec une alternance entre les lettres en Maj et Min.
    //Ex :
    //maMethode(['a', 'b', 'c', 'd', 'e'])
    //> ['a', 'B', 'c', 'D', 'e']


    //nom de la methode alternatecase
    public static char[] alternateCase(char[] array){
        var result = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 ==0) {
                // on fais miniscule
                result[i] = Character.toLowerCase(array[i]);
                //on fais majsucule
            } else {
                result[i] =  Character.toUpperCase(array[i]);
            }
        }
        return result;
    }
    // main=creer un tabaleau de christian
    // appliquer la methode
    // et affichage
    public static void main(String[] args) {
        var array = new char[] {'a', 'b', 'c', 'd', 'e'};
        System.out.println(Arrays.toString(array));
        var alternateArray = alternateCase(array);
        System.out.println(Arrays.toString(alternateArray));
    }
}

