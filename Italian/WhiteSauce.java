package Italian;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhiteSauce extends Pasta{
    double cost = 250.0;

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "WhiteSauce";
    }

    @Override
    public void SteamedPasta() {
        System.out.println("Serving hot pasta in bowl");
    }

    @Override
    public void addCheese() {
        System.out.println("Adding Cheese");
    }

    //hook
    public boolean customerWantsExtraCheese(){
        String answer = getUserInput();

        if(answer.toLowerCase().startsWith("y")){
            cost = cost + 10.0;
            return true;
        }
        else
            return false;
    }

    private String getUserInput(){
        String answer = null;
        System.out.println("Would you like Extra Cheese? --- 10.0 (y/n)");

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
