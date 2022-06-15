package TP1_Oriente_objet;

 class Personne {
     //TP 1 POO:
     //Ecrire une classe Personne qui est décrit par les données suivantes:
     //firstName
     //lastName
     //pays
     //married(booléen)
     //nombreEnfants
     //
     //On doit avoir une méthode qui retourne un string nomComplet
     //
     //Dans le main, vous devez à partir du clavier demander à l'utilisateur de fournir toutes ces données et enfin les afficher dans main.
     private String firstName;
     private String lastName;
     private String pays;
     private boolean married;
     private byte nombreenfants;

     public Personne(String firstName,String lastName,String pays,boolean married,byte nombreenfants){
         this.firstName=firstName;
         this.lastName=lastName;
         this.pays=pays;
         this.married=married;
         this.nombreenfants=nombreenfants;
     }
     //getter
     public String getfirstName() {
         return firstName;
     }
     public String getLastNameName() {
         return lastName;
     }
     public String getLastpays() {
         return pays;
     }
     public boolean isMarried() {
         return married;
     }
     public byte getNombreenfants() {
         return nombreenfants;
     }
     public void setFirstName(String firstName) {this.firstName = firstName;}

     public void setLastName(String lastName) {this.lastName=lastName;}
     public void setPays(String pays) {this.pays = pays;}
     public void setMarried(boolean married){this.married=married;}
     public void setNombreenfants(byte nombreenfants){this.nombreenfants=nombreenfants;}








     String nomComplet() {
         return firstName +" " + lastName;
     }





}
