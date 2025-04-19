package pres;

import dao.DaoImpl;
import ext.DaoImpV2;
import metier.MetierImpl;

public class presentationV1 {
    public static void main(String[] args) {
        /*
        injection des dependances par instanciation statique=>NEW
         */

        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d); // injection des dependances via le constructeur
        //metier.setDao(d);//Injection via le setter
        System.out.println("RES="+metier.calcul());
    }
}
