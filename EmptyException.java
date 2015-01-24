package pp.test3_2.bier;

/**
 * Created by eiabea on 1/24/15.
 */
public class EmptyException extends Exception {

    private Beer beer;

    public EmptyException(Beer beer){
        super("OMG where is the barkeeper??");
        this.beer = beer;
    }

    public Beer getBeer() {
        return beer;
    }
}
