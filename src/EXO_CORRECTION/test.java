package EXO_CORRECTION;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> jours = new ArrayList<>();
        ArrayList<Integer> numeros=new ArrayList<>();

        for(int i=0;i<7;i++){
            System.out.printf("saisir le nom du jour");
            String nomDujour= input.next();

            jours.add(nomDujour);

        }
        for (int i = 0; i <= 6 ; i++)
        {
            System.out.printf
                    ("Veuillez entrer le numero correspondant a %s (entre 1 et 7) : ",jours.get(i));

         int numero=input.nextInt();
         numeros.add(numero);
        }
        System.out.println(numeros);
        System.out.println(jours);

    }
}
