//Concrete Component

package Chinese;

public class Noodles extends Chinese {
    public Noodles(){
        description = "Noodles";
    }

    @Override
    public double cost() {
        return 45.00;
    }
}
