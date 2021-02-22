import Chinese.*;

public class ChineseFactory {

    public Chinese makeChinese(String chineseType) {
        if (chineseType.equals(null)){
            return null;
        }
        else if(chineseType.equals("Noodles")){
            return new Noodles();
        }
        else if(chineseType.equals("Manchurian")){
            return new Manchurian();
        }
        return null;
    }

}
