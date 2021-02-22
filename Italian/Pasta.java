package Italian;

public abstract class Pasta implements Italian {
    public abstract double cost();
    public abstract String getDescription();

    //template method
    @Override
    public void prepareItalian() {
        boilWater();
        SteamedPasta();
        pourBowl();

        if(customerWantsExtraCheese()) {
            addCheese();
        }
    }

    public void boilWater(){
        System.out.println("Boiling water");
    }

   

    public void pourBowl(){
        System.out.println("Pouring pasta into bowl");
    }
    public abstract void SteamedPasta();

    public abstract void addCheese();

    boolean customerWantsExtraCheese(){
        return true;
    }
}
