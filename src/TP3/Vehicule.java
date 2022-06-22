package TP3;

public abstract class Vehicule {
    //Objectif:
    //Créer une classe abstraite.
    //Dériver une classe abstraite.
    //Implémenter une méthode abstraite.

    //Énoncé:
    //Un parc auto se compose des voitures et des camions qui ont des caractéristiques communes regroupées dans la classe Véhicule.
    //Chaque véhicule est caractérisé par son matricule, l’année de son modèle, son prix.
    //Lors de la création d’un véhicule, son matricule est incrémenté selon le nombre de véhicules créés.
    //Tous les attributs de la classe véhicule sont supposés privés. ce qui oblige la création des accesseurs (get…) et des mutateurs (set….) ou les propriétés.
    //La classe Véhicule possède également deux méthodes abstraites démarrer() et accélérer() qui seront définies dans les classes dérivées et qui affichent des messages personnalisés.
    //La méthode ToString() de la classe Véhicule retourne une chaîne de caractères qui contient les valeurs du matricule, de l’année du modèle et du prix.
    //Les classes Voiture et Camion étendent la classe Véhicule en définissant concrètement les méthodes accélérer() et démarrer() en affichant des messages personnalisés.
    //Travail à faire:
    //Créer la classe abstraite Véhicule.
    //Créer les classes Camion et Voiture.
    //Créer une classe Test  qui permet de tester la classe Voiture et la classe Camion

    private int matricule;
    private static int compteur=0;
    private int anneeModele;
    private double prix;

    public Vehicule(int anneeModele,double prix){

      compteur++;
        this.matricule=compteur;
        this.anneeModele=anneeModele;
        this.prix=prix;
     }

    public int getMatricule() {return matricule;}
    public void setMatricule(int matricule) {this.matricule = matricule;}

    public int getAnneeModele() {return anneeModele;}
    public void setAnneeModele(int anneeModele) {this.anneeModele = anneeModele;}

    public double getPrix() {return prix;}
    public void setPrix(double prix) {this.prix = prix;}

    public abstract void demarrer();

    public abstract void accelerer();


    
@Override
    public String toString() {
       return String.format("\nLe matricule du vehicule est : %d\nL'annee du modele est : %d\nLe prix du vehicule est de %.2f euros."
               ,this.matricule,this.anneeModele,this.prix);
    }
}

