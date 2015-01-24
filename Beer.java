package pp.test3_2.bier;

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
}
