import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
// impotr java.util.Iterator;
class Main {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> foodList = new ArrayList<HashMap<String, String>>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1.add menu");
            System.out.println("2.show menu");
            System.out.println("3.exit");
            System.out.println("4.add new property");
            int numb =  Integer.parseInt(scan.nextLine());

            if (numb == 1) {
                HashMap<String, String> foodInfo = new HashMap<String, String>();
                System.out.println("What food do you want?");
                String foodKey = scan.nextLine();
                System.out.println("From which country?");
                String foodValue = scan.nextLine();
                foodInfo.put("Name", foodKey);
                foodInfo.put("Country", foodValue);
                foodList.add(foodInfo);
            }
            else if (numb == 2) {
                for(int i = 0; i < foodList.size(); i++) {
                    System.out.print(i + ": ");
                    System.out.println(foodList.get(i));
                }
            }
            else if (numb == 3) {
                break;
            }
            else if (numb == 4) {
                System.out.println("type the index");
                int number = Integer.parseInt(scan.nextLine());
                System.out.println("What is your new property?");
                String newProperty = scan.nextLine();
                System.out.println("For what value?");
                String newPropertyValue = scan.nextLine();
                foodList.get(number).put(newProperty, newPropertyValue);
                
            }
            else {
                System.out.println("Please choose among 1,2,3!");
            } 
        }
    scan.close();
    }
}


//1. show menu
//2. click the number
//3. Each number has its own function
// 3-1. type 1, input -> food and it goes to the foodlist
