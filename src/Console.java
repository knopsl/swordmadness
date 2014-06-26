/**
 * Created by mat on 26/06/14.
 */
public class Console extends Item {

    public String inputs;

    public int getNumberOfViews() {
        return numberOfViews;
    }

    private int numberOfViews=0;

    public String getInputs() {
        numberOfViews++;
        return inputs.toUpperCase();
    }

    public void incrementCounter() {
        numberOfViews++;
    }

    public void setInputs(String theInputs){
        inputs = "theinputs:"+theInputs;
    }


}
