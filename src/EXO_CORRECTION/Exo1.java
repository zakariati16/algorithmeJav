package EXO_CORRECTION;

public class Exo1 {
    //E1.
    //Ecrire un algorithme qui demande l'âge d'un enfant. Ensuite, il l'informe de sa catégorie :
    //« Poussin » de 7 à 9 ans
    //« Pupille » de 10 à 11 ans
    //« Benjamin » de 12 à 13 ans
    //« Minime » de 14 à 15 ans
    //« Cadet » 16 à 17 ans
    public static void main(String[] args) {
        byte age=10;

        if(age>=7 && age<=9){
            System.out.println("Poussin");
        }else if(age>=10 && age<=11){
            System.out.println("Pupille");
        }else if(age>=12 && age<=13){
            System.out.println("Benjamin");
        }else if(age>=14 && age<=15){
            System.out.println("Minime");
        }else if(age>=16 && age<=17){
            System.out.println("Cadet");
        }else{
            System.out.println("pas de catégorie d'âge");
        }
    }
}
