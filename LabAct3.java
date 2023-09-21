import java.util.*;

public class LabAct3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO KAHIT SAAN");

        //To store orders
        List<String> orders = new ArrayList<>();

        while (true) {
            // Menu
            System.out.println("Choose from the Menu!");
            String[] Menu = {"Main Dish(MD)", "Appetizer(A)", "Sweets(S)", "Drinks(D)"};
            for (int i = 0; i < Menu.length; i++) {
                System.out.println(Menu[i] + " ");
            }
            Scanner userInputMenu = new Scanner(System.in);
            System.out.println("Choose a Menu: ");
            String userMenu = userInputMenu.nextLine();



            

            // Main Dish
            if (userMenu.equals("MD")) {
                System.out.println("Main Dish:   Adobo(MD1)  Tapa(MD2)  Nilaga(MD3)  Dinuguan(MD4)");
                String[] mainDish = {"Adobo", "Tapa", "Nilaga", "Dinuguan"};
                Scanner userInputMD = new Scanner(System.in);
                System.out.println("Enter Main Dish: ");
                String MD = userInputMD.nextLine();

                if (MD.equals("MD1")) {
                    System.out.println("Main Dish: " + mainDish[0]);
                    orders.add(mainDish[0]);
                } else if (MD.equals("MD2")) {
                    System.out.println("Main Dish: " + mainDish[1]);
                    orders.add(mainDish[1]);
                } else if (MD.equals("MD3")) {
                    System.out.println("Main Dish: " + mainDish[2]);
                    orders.add(mainDish[2]);
                } else if (MD.equals("MD4")) {
                    System.out.println("Main Dish: " + mainDish[3]);
                    orders.add(mainDish[3]);
                }







            // Appetizer
            } else if (userMenu.equals("A")) {
                System.out.println("Appetizer:   Burger(A1)  Barbecue(A2)  Kwek-kwek(A3)  Shanghai(A4)");
                String[] Appetizer = {"Burger", "Barbecue", "Kwek-kwek", "Shanghai"};
                Scanner userInputA = new Scanner(System.in);
                System.out.println("Enter Appetizer: ");
                String App = userInputA.nextLine();

                if (App.equals("A1")) {
                    System.out.println("Appetizer: " + Appetizer[0]);
                    orders.add(Appetizer[0]);
                } else if (App.equals("A2")) {
                    System.out.println("Appetizer: " + Appetizer[1]);
                    orders.add(Appetizer[1]);
                } else if (App.equals("A3")) {
                    System.out.println("Appetizer: " + Appetizer[2]);
                    orders.add(Appetizer[2]);
                } else if (App.equals("A4")) {
                    System.out.println("Appetizer: " + Appetizer[3]);
                    orders.add(Appetizer[3]);
                }






            // Sweets
            } else if (userMenu.equals("S")) {
                System.out.println("Sweets:   Ube Crinkle Cookies(S1)  Cassava Cake(S2)  Taho(S3)  Puto(S4)");
                String[] Sweets = {"Ube Crinkle Cookies", "Cassava Cake", "Taho", "Puto"};
                Scanner userInputS = new Scanner(System.in);
                System.out.println("Enter Sweets: ");
                String Sw = userInputS.nextLine();

                if (Sw.equals("S1")) {
                    System.out.println("Sweets: " + Sweets[0]);
                    orders.add(Sweets[0]);
                } else if (Sw.equals("S2")) {
                    System.out.println("Sweets: " + Sweets[1]);
                    orders.add(Sweets[1]);
                } else if (Sw.equals("S3")) {
                    System.out.println("Sweets: " + Sweets[2]);
                    orders.add(Sweets[2]);
                } else if (Sw.equals("S4")) {
                    System.out.println("Sweets: " + Sweets[3]);
                    orders.add(Sweets[3]);
                }


                


            // Drinks
            } else if (userMenu.equals("D")) {
                System.out.println("Drinks:   Juice(D1)  Softdrinks(D2)  Water(D3)  Alcohol(D4)");
                String[] Drinks = {"Juice", "Softdrinks", "Water", "Alcohol"};
                Scanner userInputD = new Scanner(System.in);
                System.out.println("Enter Drinks: ");
                String Dr = userInputD.nextLine();

                if (Dr.equals("D1")) {
                    System.out.println("Drinks: " + Drinks[0]);
                    orders.add(Drinks[0]);
                } else if (Dr.equals("D2")) {
                    System.out.println("Drinks: " + Drinks[1]);
                    orders.add(Drinks[1]);
                } else if (Dr.equals("D3")) {
                    System.out.println("Drinks: " + Drinks[2]);
                    orders.add(Drinks[2]);
                } else if (Dr.equals("D4")) {
                    System.out.println("Drinks: " + Drinks[3]);
                    orders.add(Drinks[3]);
                }
            }

            
            // Repeating order
            System.out.println("Do you want to repeat your order? (Y/N): ");
            String repeatChoice = scanner.nextLine();

            if (!repeatChoice.equalsIgnoreCase("Y")) {
                break;
            }
        }

        // Print all orders
        System.out.println("*****************************************");
        System.out.println("YOUR ORDERS:");
        for (String order : orders) {
            System.out.println(order);
        }
        System.out.println("*****************************************");
    }
}