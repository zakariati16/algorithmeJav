package Cours_bases_Java;

public class Boolean {
    public static void main(String[] args) {
        byte age=20;
        boolean estMajeur=age>=18;

      //  if(estMajeur){
        //    System.out.println("Vous etes majeur");
        //}else{
          //  System.out.println("Vous n'etes pas majeur");
    //}
        String situationAge=age>=18?"etesMajeur":"n'etes pas majeur";
        System.out.printf("vous %s",situationAge);
    }
}

