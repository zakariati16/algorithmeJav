package EXO_CORRECTION;

public class Exo4 {
    public static void main(String[] args) {
        // Ecrire un programme Java qui déclare 3 variables, a,b,c et qui va ensuite effectuer une permutation de ces valeurs :
        //
        System.out.println("les resultats avant permutation");
        int a=51;
        System.out.println("a="+a);
        int b=876;
        System.out.println("b="+b);
        int c=235;
        System.out.println("c="+c);
        int d;
        System.out.println("d");

        d=c;
        c=b;
        b=a;
        a=d;
        System.out.println("avec permutation");
        System.out.println("d="+c);
        System.out.println("c="+b);
        System.out.println("b="+a);
        System.out.println("a="+d);

    }

}

