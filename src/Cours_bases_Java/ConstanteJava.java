package Cours_bases_Java;

import java.util.Scanner;

public class ConstanteJava {
    public static void main(String[] args) {
        var input=new Scanner(System.in);
//        constante : Une fois declaree la valeur ne peut plus changer
        final double g=9.8;

//        declaration par inference
        var pays="France"; // En gros au lieu de définir ton type (string, int ... )
        // on peux mettre <var> à la place
        // et en gros java va automatiquement capter le type de variable

        var age1=22;

        int age; // 1 - declaration sans initialisation
        age=17;

        double poids=85;// 2 - declaration avec initialisation
    }
}
