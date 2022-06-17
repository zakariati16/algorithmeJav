package Poo;

public class Rectangle2 {

    // avec getter et setter
    private double longueur;
    private double largeur;

    //Accesseurs ou Getter : Ce sont des méthodes qui nous donnent un accès en lecture
    // aux membres ou attributs privés
    public double getLongueur(){
        return longueur;
    }

    public double getLargeur(){
        return largeur;
    }

    //Manipulateurs ou setters : Ce sont des méthodes qui nous donnent la possibilité
    // de modifier des attributs privés
    // void permet d'afficher une valeur

    public void setLongueur(double nouvelleValeur){
        longueur=nouvelleValeur;
    }

    public void setLargeur(double nouvelleValeur){
        largeur=nouvelleValeur;
    }


    double calculDeLaSurface(){
        return longueur*largeur;
    }

    double calculDuPerimetre(){
        return 2*(longueur+largeur);
    }
}

