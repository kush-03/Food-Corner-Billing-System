package Italian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Pizza implements Italian{
    public abstract double cost();
    public abstract String getDescription();

    //template method
    @Override
    public void prepareItalian() {
        uncoverItalian();
        pourDish();
        putVeggies();

        if(customerWantsExtraCheese()) {
            addCheese();
        }
    }

    public void uncoverItalian(){
        System.out.println("Uncovering the dish of pizza base");
    }

    public void pourDish(){
        System.out.println("Pouring pizza sauce on base");
    }

    public void putVeggies(){
        System.out.println("Put vegetables");
    }

    public void addCheese(){
        System.out.println("Adding Cheese");
    }

    //hook
    public boolean customerWantsExtraCheese(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            return true;
        }
        else
            return false;
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like Extra Cheese? (y/n)");

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = input.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(answer == null){
            answer = "no";
        }

        return answer;
    }
}
