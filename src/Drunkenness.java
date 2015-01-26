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

        if(first == null){
            return "You are not drunk...yet";
        }

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

    public int lastIndexByBrewery(String brewery){
        if(first != null){
            return first.lastIndexByBrewery(brewery);
        }

        return -1;
    }

    public int firstIndexByBrewery(String brewery){
        if(first != null){
            return first.firstIndexByBrewery(brewery);
        }

        return -1;
    }
}
