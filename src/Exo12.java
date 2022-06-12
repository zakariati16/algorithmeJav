import java.util.Scanner;
public class Exo12 {
    // il daoit afficher par exemple 1 2 3 4 5 6 7 8 9 10
    public static void main(String[] arg) {
        Scanner input=new Scanner(System.in);
        System.out.println("nombre ?");
        int n = input.nextInt()+1;

        for (int i=n;i<(n+10);i=i+1){
            System.out.println(i);

    }

    }
}
