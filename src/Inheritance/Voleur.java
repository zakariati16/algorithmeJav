package Inheritance;

public class Voleur extends Personnage{


        private String arme;

        public Voleur(String nom,int dureeDevie,String arme) {
super(nom,dureeDevie);
           this.arme = arme;
        }

        public String getArme() {
            return arme;
        }

        public void setArme(String arme) {
            this.arme = arme;
        }

    @Override
    public void rencontrer() {
        System.out.println("je suis un voleur fait bien attention");;
    }

    public void voler(){
            System.out.println("Cache bien ton téléphone");
        }
    }

