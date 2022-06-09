import java.util.Scanner;
public class Exo7 {
    public static void main(String[] args) {
       // entrer un nombre entier Exercice 7
        //Ecrivez un programme Java qui lit un nombre et indique s'il est positif, négatif ou s'il vaut zéro et s'il est pair ou impair.
        //Exemple d'exécution:
        //Entrez un nombre entier: 5
        //Le nombre est positif et impair
        //Entrez un nombre entier: -4
        //Le nombre est négatif et pair
        //Entrez un nombre entier: 0
        //Le nombre est zéro (et il est pair)

        Scanner input=new Scanner(System.in);
        System.out.print(" entrez un nombre entier: ");
        int nombre=input.nextInt();
// affichage du nombre
        System.out.printf("Le nombre choisi est " +nombre);
// application de la condition avec l'affichage
        if (nombre == 0){System.out.print(", il est null");}
        else if (nombre%2==0) {System.out.print(", il est pair");}
        else System.out.print(", il est impair");

        if (nombre>0)
            System.out.print(",il est positif");
        else if(nombre<0) System.out.print(",il est negatif");
        else System.out.print(",il est ni positif, ni negatif");





    }
}
