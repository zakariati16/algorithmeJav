package EXO_CORRECTION;

public class Exo3 {
    //E3.
    // Ecrire un programme Java qui demande à l'utilisateur de saisir
    // son nom, prenom et age,
    // et qui ensuite va afficher le message : "Vous vous appelez <prenom> <nom>, et vous avez <age> ans"
    public static void main(String[] args) {
    byte age=26;
        String nom="tissafi";
        String prenom="zakaria";
        //System.out.println("vous vous appelez "+nom+" "+prenom+"et vous avez"+age+ "ans");
        System.out.printf("vous vous appelez %s %s et vous avez %d ans",nom,prenom,age);
    }
}




//l'utilite de + pour garder l'affichage de vous vous appelez nom prenom et vous avez age ans