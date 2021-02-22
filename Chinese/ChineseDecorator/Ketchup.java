package Chinese.ChineseDecorator;


import Chinese.Chinese;

public class Ketchup extends DishDecorator{
    Chinese chinese;

    public Ketchup(Chinese chinese){
        this.chinese = chinese;
    }

    @Override
    public double cost() {
        return 5.0 + chinese.cost();
    }

    @Override
    public String getDescription() {
        return chinese.getDescription() + ",Ketchup";
    }
}
