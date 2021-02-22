package Italian;

public class MargeritaPizza extends Pizza {
    @Override
    public double cost() {
        return 250.0;
    }

    @Override
    public String getDescription() {
        return "MargeritaPizza";
    }
}
