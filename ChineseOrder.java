
public class ChineseOrder implements Command{
    Cook cook;
    String[] sauceList;
    String order;
    public ChineseOrder(Cook cook, String order,  String[] sauceList){
        this.cook = cook;
        this.order = order;
        
      
        this.sauceList = sauceList;
    }

    @Override
    public void orderUp() {
        cook.chineseType = order;
        
        cook.sauceList = this.sauceList;
        cook.getOrder("Chinese");
    }
}
