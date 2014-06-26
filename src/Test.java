/**
 * Created by mat on 26/06/14.
 */
public class Test {

    public static void main(String[] arg){
            Item heftnr77 = new Item();
            heftnr77.name = "The amasing spiderman nr 77.";

        Item heftnr78 = new Item();
        heftnr78.name = "The amasing spiderman nr 78.";


        Console sega = new Console();
        sega.name="Sega mega drive";
        sega.priceInDollars= 200.99;
        sega.setInputs("usb");


        Item superman2 = new Item();
        superman2.name = "The superman nr 2.";
        superman2.priceInDollars = 77.59;


        sega.getInputs();
        sega.getInputs();


        System.out.println(sega.name + " inputs: " + sega.getNumberOfViews());

        System.out.println(superman2.name + " price: " + superman2.priceInDollars);



    }

}
