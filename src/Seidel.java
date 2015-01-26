/**
 * Created by eiabea on 1/24/15.
 */
public class Seidel extends Beer {
    public Seidel(String brewery){
        super(brewery, 330);
    }
    
    @Override
    public int getContent() {
        return 330;
    }
}
