package Italian;

public class ExorticaPizza extends Pizza{
    @Override
    public double cost() {
        return 200.0;
    }

    @Override
    public String getDescription() {
        return "ExorticaPizza";
    }
}
