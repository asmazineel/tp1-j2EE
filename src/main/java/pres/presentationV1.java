package pres;

import metier.MetierImpl;

public class presentationV1 {
    public static void main(String[] args) {
        MetierImpl metier = new MetierImpl();
        System.out.println(metier.calcul());
    }
}
