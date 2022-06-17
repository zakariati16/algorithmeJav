package TP2;

public class Patient {

//Le but de cet exercice est de créer des « patients » qui ont un poids et une taille,et de calculer leur « Indice de Masse Corporelle» (IMC).
//crée un patient,
//affiche les données du patient ainsi que son IMC.
//Avoir la possibilité de connaître la taille du patient, son poids
     public class Patients {

        private String firstName;
        private String lastName;
        private float taille;
        private  float poids ;

        public Patients(String firstName, String lastName, float taille, float poids){
            this.firstName=firstName;
            this.lastName=lastName;
            this.taille=taille;
            this.poids=poids;
        }

        public Patients(){
            this.firstName="";
            this.lastName="";
            this.taille=0.0F;
            this.poids=0.0F;
        }
// getter
        public String getFirstName() { return firstName;}
        public String getLastName() { return lastName;}
        public float getTaille() {return taille;}
        public float getpoids () {return poids;}

//setter
        public void setFirstName( String firstName) {this.firstName=firstName;}
        public void setLastName( String lastName) {this.lastName=lastName;}
        public void setTaille( float taille) {this.taille=taille;}
        public void setPoids( float poids) {this.poids=poids;}



        public double iMC(){
            return poids/(taille*taille);
        }
    }
}

