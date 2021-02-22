//Concrete Component

package Chinese;

public class Manchurian extends Chinese {
    public  Manchurian(){
        description = "Manchurian";
    }

    @Override
    public double cost() {
        return 50.00;
    }
}
