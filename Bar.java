package pp.test3_2.bier;

import java.util.HashMap;
import java.util.Objects;

/**
 * Created by eiabea on 1/24/15.
 */
public class Bar {
    public static void main (String[] args){

        Drunkenness drunkenness = new Drunkenness();

        Beer seidl = new Seidel("Wieselburger");
        Beer kruegerl = new Kruegerl("Stiegl");

        slug(drunkenness, seidl, 340);
        slug(drunkenness, kruegerl, 540);

        System.out.println("Drunkness: \n" + drunkenness.toString() + "\nTotal: " + drunkenness.getTotal() + "ml");

    }

    private static void slug(Drunkenness drunkenness, Beer beer, int amount){
        try {
            beer.drink(amount);
        } catch (EmptyException e) {
            drunkenness.add(e.getBeer());
        }
    }

}
