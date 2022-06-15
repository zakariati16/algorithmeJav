package Poo;

class Rectangle {
    //sans getter et setter
    //1 fichier = une classe

    double longueur;
    double largeur;

    double calculDeLaSurface() {
        return longueur * largeur;
    }

    double calculDuPerimetre() {
        return 2 * (longueur + largeur);
    }

}

