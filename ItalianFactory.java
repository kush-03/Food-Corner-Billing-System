import Italian.*;

public class ItalianFactory {

    public Italian makeItalian(String italianType) {
        if (italianType.equals(null)){
            return null;
        }
        else if(italianType.equals("WhiteSauce")){
            return new WhiteSauce();
        }
        else if(italianType.equals("RedSauce")){
            return new RedSauce();
        }
        else if(italianType.equals("ExorticaPizza")){
            return new ExorticaPizza();
        }
        else if(italianType.equals("MargeritaPizza")){
            return new MargeritaPizza();
        }
        
        return null;
    }

}
