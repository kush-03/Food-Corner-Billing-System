import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    static String italianType="";
    public static void main(String[] args) {
        Waitress waitress = new Waitress();
        Cook cook = new Cook();

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("What do you want to order?");
            System.out.println("(1) Chinese");
            System.out.println("(2) Italian");
            System.out.println("(Other) I have finished ordering.");

            int a = scanner.nextInt();
            if(a==1) {
                
                ArrayList<String> sauceList = new ArrayList<>();

                String chineseType = null;
                String answer = null;

                while (true) {
                    System.out.println("Which Chinese do you want?");
                    System.out.println("(1)  Noodles --- 45.0 Rs");
                    System.out.println("(2) Manchurian --- 50.0 Rs");

                    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                    try {
                        answer = input.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    if (answer.equals("1")) {
                        chineseType = "Noodles";
                        System.out.println("*** Noodles is chosen.");
                        break;
                    } else if (answer.equals("2")) {
                        chineseType = "Manchurian";
                        System.out.println("*** Manchurian is chosen.");
                        break;
                    } else {
                        continue;
                    }
                }
                System.out.println("");

                System.out.println("-------------------- INGREDIENTS --------------------");
                

                Scanner scan3 = new Scanner(System.in);
                for (int i = 0; i < 3; i++) {
                    System.out.println("-------------------- Extra Types --------------------");
                    System.out.println("(1) MagicMasala --- 10.0 Rs");
                    System.out.println("(2) Ketchup --- 5.0 Rs");
                    System.out.println("(3) Cheese --- 10.0 Rs");
                    System.out.println("(Other) I finished the Extra selection.");
                    int value = scan3.nextInt();
                    if (value == 1) {
                        sauceList.add("MagicMasala");
                        System.out.println("*** MagicMasala is chosen.");
                    } else if (value == 2) {
                        sauceList.add("Ketchup");
                        System.out.println("*** Ketchup is chosen.");
                    } else if (value == 3) {
                        sauceList.add("Cheese");
                        System.out.println("*** Cheese is chosen.");
                    } else break;
                }
                System.out.println("The selection of Extras is completed.");
                System.out.println("");

                
                String[] sauceArr = new String[sauceList.size()];
                sauceArr = sauceList.toArray(sauceArr);

                ChineseOrder chineseOrder = new ChineseOrder(cook, chineseType,sauceArr);
                waitress.takeOrder(chineseOrder);
            }

            else if(a==2) {
                Scanner scanItalian = new Scanner(System.in);
                System.out.println("-------------------- Italian --------------------");
                for (int i = 0; i < 1; i++) {
                    System.out.println("-------------------- Italian Types --------------------");
                    System.out.println("(1) WhiteSauce --- 250.0 Rs");
                    System.out.println("(2) RedSauce --- 200.0 Rs");
                    System.out.println("(3) ExorticaPizza --- 200.0 Rs");
                    
                    System.out.println("(4) MargeritaPizza --- 250.0 Rs");
                    
                    System.out.println("(Other) I finished the Italian selection.");
                    int italy = scanItalian.nextInt();
                    if(italy==1){
                        italianType="WhiteSauce";
                        System.out.println("*** white sauce pasta is chosen.");
                    }
                    else if(italy==2){
                        italianType="RedSauce";
                        System.out.println("*** Red Sauce Pasta is chosen.");
                    }
                    else if(italy==3){
                        italianType="ExorticaPizza";
                        System.out.println("*** Exortica pizza  is chosen.");
                    }
                   
                    
                    else if(italy==4){
                        italianType="MargeritaPizza";
                        System.out.println("*** Margerita pizza is chosen.");
                    }
                    
                    else{
                        break;
                    }
                }
                System.out.println("The selection of Italians is completed.");
                System.out.println("");

                ItalianOrder italianOrder = new ItalianOrder(cook, italianType);
                waitress.takeOrder(italianOrder);
            }

            else{
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("BON APPETIT");
                break;
            }
        }
    }
}
