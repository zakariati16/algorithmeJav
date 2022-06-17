package Tp_SerieValidation.serie1;


import javax.imageio.stream.ImageInputStream;
import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;

public class TP6 {
    //Écrire une méthode Java qui prend en paramètre un tableau 2D, et un nombre.
    //La méthode devrait nous retourner la valeur correspond au nombre de fois que ce nombre se trouve dans le tableau et ses différentes positions.
    public static ArrayList<String>  positionsNombre(int [][] matrice,int nombre){

        int somme =0;
        ArrayList<String> positions  =new ArrayList<>();

        for (int i = 0; i < matrice.length; i++) {

            for (int  j= 0; j<matrice[i].length; j++){
                if(matrice[i][j]==nombre){
                    somme=somme+1;

                    positions.add(("("+i+","+j+")"));
                }
            }
        }
        return positions;
    }
// travailler avec la methode
    public static void main(String[] args) {

        int [][] matrice={{1,4,2,1},{6,3,8,9},{1,5,1,0}};
        int nombre=1;

        TP6.positionsNombre(matrice,nombre);
        int somme=TP6.positionsNombre(matrice,nombre).size();

        System.out.println("le nombre " + nombre +" se retrouve " +somme+ " fois dans les emplacements suivants : ");
        System.out.println(TP6.positionsNombre(matrice,nombre));



    }




}

