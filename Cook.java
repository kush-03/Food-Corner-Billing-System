import Italian.Italian;
import Chinese.Chinese;
import Chinese.ChineseDecorator.*;


// Receiver
public class Cook {
    public static String chineseType="";
    public static String italianType="";
    
    public static String[] sauceList = null;
    Chinese chinese;
    Italian italian;
    public void getOrder(String factoryType){
        if(factoryType.equalsIgnoreCase("Chinese")){
            System.out.println(chineseType + " order received.");

            ChineseFactory factory =  new ChineseFactory();
            chinese = factory.makeChinese(chineseType);

            chinese.prepareDough(chineseType);
            chinese.cookDough(chineseType);
            chinese.dishUp(chineseType);
            chinese = decorate(sauceList);

            System.out.println(chinese.getDescription() + " order completed.");
            System.out.println("Cost: Rs" + chinese.cost());

        }
        else if(factoryType.equalsIgnoreCase("Italian")){
            System.out.println(italianType + " order received.");

            ItalianFactory factory = new ItalianFactory();
            italian = factory.makeItalian(italianType);
            italian.prepareItalian();

            System.out.println(italian.getDescription() + " order completed.");
            System.out.println("Cost: Rs" + italian.cost());
        }
        System.out.println("");
    }

    public Chinese decorate(String[] sauceList){
        

        for (int i = 0; i < sauceList.length; i++) {
            String sauce = sauceList[i];
            if(sauce.equals("Cheese")){
                chinese = new Cheese(chinese);
            }
            else if(sauce.equals("Ketchup")){
                chinese = new Ketchup(chinese);
            }
            else if(sauce.equals("MagicMasala")){
                chinese = new MagicMasala(chinese);
            }
        }
        return chinese;
    }
}
