package pp.test3_2.bier;

/**
 * Created by eiabea on 1/24/15.
 */
public class Drunkenness {
    private Beer first;

    public void add(Beer beer){
        if(first == null){
            first = beer;
        }else{
            first.add(beer);
        }
    }

    @Override
    public String toString() {

        Beer tmp = first;
        String output = "";

        while (tmp.getNext() != null){
            output += tmp.toString() + "\n";
            tmp = tmp.getNext();
        }

        output += tmp.toString();

        return output;
    }

    public int getTotal(){
        if(first != null){
            return first.totalCount();
        }

        return 0;
    }
}
