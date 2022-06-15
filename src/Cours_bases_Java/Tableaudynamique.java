package Cours_bases_Java;

import java.util.ArrayList;

public class Tableaudynamique {public static void main(String[] args) {

    ArrayList<Integer> notes=new ArrayList<>();

    ArrayList<String> langagesDeProgrammation=new ArrayList<>();
    System.out.println("Taille du tableau : "+langagesDeProgrammation.size());

    langagesDeProgrammation.add("Java");// index de la table langagesdepro 0
    langagesDeProgrammation.add("Python");//index 1
    langagesDeProgrammation.add("C++");//index 2
    langagesDeProgrammation.add("Fortran");//3
    langagesDeProgrammation.add("Visual Basic 6.0");//4

    System.out.println("Taille du tableau : "+langagesDeProgrammation.size());
    System.out.printf("langagesDeProgrammation[%d] : %s\n",
            0,langagesDeProgrammation.get(0));

    System.out.printf("langagesDeProgrammation[%d] %s\n",1,
            langagesDeProgrammation.get(1));

    System.out.println("Tableau avant suppression");
    System.out.println(langagesDeProgrammation);

    langagesDeProgrammation.remove(4);
    System.out.println("Tableau après suppression");
    System.out.println(langagesDeProgrammation);

    System.out.println("Renommer Python en Python 3.7");
    langagesDeProgrammation.set(1,"Python 3.7");

    System.out.println("Tableau après le renommage de Python en Python 3.7");
    System.out.println(langagesDeProgrammation);

//        Tester si le tableau est vide
    if(langagesDeProgrammation.isEmpty()){
        System.out.println("Le tableau est vide");
    }else {
        System.out.println("Le tableau n'est pas vide");
    }

//        Parcourir un tableau dynamique
    for(int i=0;i<langagesDeProgrammation.size();i++){
        System.out.printf("element[%d] : %s\n",i,langagesDeProgrammation.get(i));
    }

//        Vider le tableau
    langagesDeProgrammation.clear();
    if(langagesDeProgrammation.size()==0){
        System.out.println("Le tableau est vide");
    }else {
        System.out.println("Le tableau n'est pas vide");
    }


}
}
