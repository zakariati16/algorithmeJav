package Inheritance;
// une classe absctrect est une class qui ne peux avoir d'instance
// avec abstrect on pourra jamais creer de valeur ou instance
public abstract class Personnage {

    // on a creer cette classe parce que ily' de duplicata dans les variables entree
    // dans tous les class (nom et dureede vie
    // + methode rencontrer)
        private String nom;
        private int dureeDeVie;

        public Personnage(String nom,int dureeDeVie){
            this.nom=nom;
            this.dureeDeVie=dureeDeVie;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public int getDureeDeVie() {
            return dureeDeVie;
        }

        public void setDureeDeVie(int dureeDeVie) {
            this.dureeDeVie = dureeDeVie;
        }
// "je suis un personnage" qui lie les personnages (class)
    // ON AURA pas besoin de "rencontrer"=abstrait vue qu'on aura d'autrea message à afficher avec
    // sous classe guerier "je suis un guerrrie, je vais te tuer" sorcier"...."
        public abstract void rencontrer();
    }

