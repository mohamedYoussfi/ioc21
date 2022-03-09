package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Presentation {
 public static void main(String[] args) {
	 /*
	  * Injection des dépendances par instanciation statique
	  */
	DaoImpl d=new DaoImpl();
    MetierImpl metier=new MetierImpl();
    metier.setDao(d);
    System.out.println(metier.calcul());
 }
}
