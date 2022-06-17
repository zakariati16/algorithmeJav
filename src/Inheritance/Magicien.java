package Inheritance;

public class Magicien extends Personnage{


        private String baguette;




    public Magicien(String nom, int dureeDevie, String baguette) {
super(nom,dureeDevie);
            this.baguette = baguette;
        }



        public String getBaguette() {
            return baguette;
        }

        public void setBaguette(String baguette) {
            this.baguette = baguette;

                }

    @Override
    public void rencontrer() {
        System.out.println("attention, je suis un magicien!");;
    }
}

