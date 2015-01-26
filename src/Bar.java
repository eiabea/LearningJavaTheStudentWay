/**
 * Created by eiabea on 1/24/15.
 */
public class Bar {
    public static void main (String[] args){

        Drunkenness drunkenness = new Drunkenness();

        Beer seidl = new Seidel("Wieselburger");
        Beer kruegerl = new Kruegerl("Stiegl");
        Beer kruegerl2 = new Kruegerl("Stiegl");
        Beer seidl2 = new Seidel("Wieselburger");

//        slug(drunkenness, seidl, 340);
//        slug(drunkenness, kruegerl, 540);
//        slug(drunkenness, seidl2, 331);
//        slug(drunkenness, kruegerl2, 560);

        System.out.println("Drunkness: \n" + drunkenness.toString() + "\nTotal: " + drunkenness.getTotal() + "ml");

        System.out.println("First Stiegl Index: " + drunkenness.firstIndexByBrewery("Stiegl"));
        System.out.println("Last Stiegl Index: " + drunkenness.lastIndexByBrewery("Stiegl"));

    }

    private static void slug(Drunkenness drunkenness, Beer beer, int amount){
        try {
            beer.drink(amount);
        } catch (EmptyException e) {
            drunkenness.add(e.getBeer());
        }
    }

}
