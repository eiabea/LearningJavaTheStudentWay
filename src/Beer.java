import com.sun.org.apache.regexp.internal.REUtil;

/**
 * Created by eiabea on 1/24/15.
 */
public abstract class Beer implements DrinkInterface {
    private String brewery;
    private int totalContent;
    private int content;
    private Beer next;

    public Beer(String brewery, int totalContent) {
        this.brewery = brewery;
        this.totalContent = totalContent;
        this.content = totalContent;
    }

    public String getBrewery() {
        return brewery;
    }

    public int getContent(){
        return content;
    }

    public int getTotalContent() {
        return totalContent;
    }

    public Beer getNext() {
        return next;
    }

    public void add(Beer beer){
        if(next == null){
            next = beer;
        }else{
            next.add(beer);
        }
    }

    public int totalCount(){
        if(getNext() != null){
            return getTotalContent() + getNext().totalCount();
        }
        return getTotalContent();
    }

    @Override
    public int drink(int slug) throws EmptyException {

        content -= slug;

        if (content < 0) {
            content = 0;
            throw new EmptyException(this);
        } else {
            return content;
        }

    }

    @Override
    public String toString() {
        return String.format("%20s | %10sml | %10sml", getBrewery(), getTotalContent(), getContent());
    }

    public int lastIndexByBrewery(String brewery) {
        return lastIndexByBreweryRec(brewery, 0);
    }

    private int lastIndexByBreweryRec(String brewery, int index) {
        int deep = -1;

        if (this.getNext() != null) {
            deep = this.getNext().lastIndexByBreweryRec(brewery, index + 1);
        }

        if (deep != -1) {
            return deep;
        } else {
            if (this.brewery.equals(brewery)) {
                return index;
            } else {
                return -1;
            }

        }

    }

    public int firstIndexByBrewery(String name){

        return firstIndexByBreweryRec(name, 0);

    }

    private int firstIndexByBreweryRec(String name, int index){

        if(this.brewery == name){
            return index;
        }

        if(getNext() != null){
            return getNext().firstIndexByBreweryRec(name, index + 1);
        }

        return -1;
    }
}
