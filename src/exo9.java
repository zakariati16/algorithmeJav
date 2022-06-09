import java.util.Scanner;
public class exo9 {
    public static void main(String[] args) {
        //Exercice 9
        //Ecrire un programme qui permet à l'utilisateur de saisir un entier entre 1 et 12 et qui affiche le nom du mois correspondant.
        //Ex:
        //Mois : 4
        //Résult : Avril
        //
        //Pour cet exercices, vous devez aussi présenter une version qui utilise le sélecteur de cas(à trouver sur internet)
        Scanner input=new Scanner(System.in);
        System.out.print("saisir la valeur du mois : ");
        byte mois= input.nextByte();
        switch(mois){
            case 1:
                System.out.println("Janvier");
                break;
            case 2:
                System.out.println("février");
                break;
            case 3:
                System.out.println("mars");
                break;
            case 4:
                System.out.println("avril");
                break;
            case 5:
                System.out.println("mai");
                break;
            case 6:
                System.out.println("juin");
                break;
            case 7:
                System.out.println("juillet");
                break;
            case 8:
                System.out.println("aout");
                break;
            case 9:
                System.out.println("septembre");
                break;
            case 10:
                System.out.println("octobre");
                break;
            case 11:
                System.out.println("novembre");
                break;
            case 12:
                System.out.println("decembre");
                break;
            default:
                System.out.println("erreur");
                break;

    }
}
}
