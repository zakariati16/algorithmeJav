package test;

public class zakaria {
    private String firstName;
    private String lastName;
    private double age;
    private double anneeActuelle;

    //construction
    public zakaria(String firstName,String lastName,double age,double anneeActuelle){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
        this.anneeActuelle=anneeActuelle;
    }
    public zakaria(){
        this.firstName="";
        this.lastName="";
        this.age=0;
        this.anneeActuelle=0f;
    }
    //getter
    public String getfirstName() { return firstName;}
    public String getLastName() { return lastName;}
    public double getage() { return age;}
    public double getanneActuelle() { return anneeActuelle;}

    //setter

    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setAge(double age){this.age=age;}
    public void setAnneeActuelle(double anneeActuelle) {this.anneeActuelle = anneeActuelle;}

    //fonction=methode

    // VOID ici perPERMET D'afficher sans retourner un resultat
    public void heureux(){
        System.out.println("je suis trop content.");
    }

    public double anneeDenaissance(){
        return (anneeActuelle- age);
    }
}
