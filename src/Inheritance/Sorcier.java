package Inheritance;

public class Sorcier extends Magicien{

        private String batonMagique;

        public Sorcier(String nom,int dureeeDevie,String baguette,String batonMagique) {
super(nom,dureeeDevie,baguette);
          this.batonMagique=batonMagique;
        }

        public String getBatonMagique() {
            return batonMagique;
        }

        public void setBatonMagique(String batonMagique) {
            this.batonMagique = batonMagique;

        }

    @Override
    public void rencontrer() {
        System.out.println("je suis un sorcier");;
    }
}

