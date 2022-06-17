package test;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        zakaria zakaria1=new zakaria();
        zakaria zakaria2=new zakaria("fatima ezzahra","sabir",24,2022);

        Scanner input=new Scanner(System.in);
        System.out.println("veuillez saisir vos coordonnées: ");

        System.out.print("firstName: ");
        zakaria1.setFirstName(input.nextLine());
        System.out.print("lastName: ");
        zakaria1.setLastName(input.nextLine());
        System.out.print("age: ");
        zakaria1.setAge(input.nextByte());
        System.out.print("anneeactuelle: ");
        zakaria1.setAnneeActuelle(input.nextFloat());

//
        System.out.println("votre prenom est "+zakaria1.getfirstName());
        System.out.println("votre nom est "+zakaria1.getLastName());
        System.out.println("votre ages est "+zakaria1.getage());
        System.out.println("l'annee actuelle est "+zakaria1.getanneActuelle());

        System.out.println("votre annee de naissance est : "+zakaria1.anneeDenaissance());


        System.out.println("votre prenom est "+zakaria2.getfirstName());
        System.out.println("votre nom est "+zakaria2.getLastName());
        System.out.println("votre ages est "+zakaria2.getage());
        System.out.println("l'annee actuelle est "+zakaria2.getanneActuelle());

        System.out.println("votre annee de naissance est : "+zakaria2.anneeDenaissance());


    }
}
