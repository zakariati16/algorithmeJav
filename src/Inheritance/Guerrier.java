package Inheritance;
/// extends permet au guerrier d'heriter les valeurs de personnages

public class Guerrier extends Personnage{


        private String arme;
//constructeur
//super ici pour faire appel au variable nom et dureedevie qui viennent du class parent personnage
// = les varibles communs avec la class parents

        public Guerrier(String nom, int dureeDeVie, String arme) {
       super(nom,dureeDeVie);
        this.arme = arme;
        }


    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
            this.arme = arme;
        }
    // redefinition = afficher la methode rencontrer et qu'elle soit spécifier a la sous class guerrier
    //redefinir la methode de la class parent

    @Override
    public void rencontrer() {
        System.out.println("je suis un guerrier, et je vais te tuer");;
    }
}




