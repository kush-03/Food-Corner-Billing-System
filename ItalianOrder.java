
public class ItalianOrder implements Command{
    Cook cook;
    String order;
    public ItalianOrder(Cook cook, String order){
        this.cook = cook;
        this.order= order;
    }

    @Override
    public void orderUp() {
        cook.italianType = order;
        cook.getOrder("Italian");
    }
}
