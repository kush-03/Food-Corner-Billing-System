package Chinese.ChineseDecorator;

import Chinese.Chinese;

public class Cheese extends DishDecorator {
    Chinese chinese;

    public Cheese(Chinese chinese){
        this.chinese = chinese;
    }

    @Override
    public double cost() {
        return 10.0 + chinese.cost();
    }

    @Override
    public String getDescription() {
        return chinese.getDescription() + ", Cheese";
    }
}
