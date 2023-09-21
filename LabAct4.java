import java.util.*;
public class LabAct4 {
    public static void main(String[] args){
        System.out.println("\r\n" + //
                " ___       __   _______   ___       ________  ________  _____ ______   _______      \r\n" + //
                "|\\  \\     |\\  \\|\\  ___ \\ |\\  \\     |\\   ____\\|\\   __  \\|\\   _ \\  _   \\|\\  ___ \\     \r\n" + //
                "\\ \\  \\    \\ \\  \\ \\   __/|\\ \\  \\    \\ \\  \\___|\\ \\  \\|\\  \\ \\  \\\\\\__\\ \\  \\ \\   __/|    \r\n" + //
                " \\ \\  \\  __\\ \\  \\ \\  \\_|/_\\ \\  \\    \\ \\  \\    \\ \\  \\\\\\  \\ \\  \\\\|__| \\  \\ \\  \\_|/__  \r\n" + //
                "  \\ \\  \\|\\__\\_\\  \\ \\  \\_|\\ \\ \\  \\____\\ \\  \\____\\ \\  \\\\\\  \\ \\  \\    \\ \\  \\ \\  \\_|\\ \\ \r\n" + //
                "   \\ \\____________\\ \\_______\\ \\_______\\ \\_______\\ \\_______\\ \\__\\    \\ \\__\\ \\_______\\\r\n" + //
                "    \\|____________|\\|_______|\\|_______|\\|_______|\\|_______|\\|__|     \\|__|\\|_______|\r\n" + //
                "                                                                                    \r\n" + //
                "                                                                                    \r\n" + //
                "                                                                                    \r\n" + //
                "");
        Scanner sc = new Scanner(System.in);

        while (true) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter 3 items: ");

        String str1 = userInput.nextLine();
        String str2 = userInput.nextLine();
        String str3 = userInput.nextLine();

        LinkedList<String> items = new LinkedList<>();
        
        items.add(str1);
        items.add(str2);
        items.add(str3);

        System.out.println("**********************************************************");
        System.out.println("LinkedList: " + items);
        System.out.println("**********************************************************");

        //Add to first
        System.out.println();
        System.out.println("**********************************************************");
        System.out.println("Add 2 items (at first): ");
        System.out.println("**********************************************************");
        String str4 = userInput.nextLine();
        String str5 = userInput.nextLine();

        items.addFirst(str4);
        items.addFirst(str5);
        System.out.println("**********************************************************");
        System.out.println("LinkedList (Updated): " + items);
        System.out.println("**********************************************************");
        
        //Remove Last
        System.out.println();
        items.remove(str2);
        items.remove(str3);
        System.out.println("**********************************************************");
        System.out.println("LinkedList (Updated): " + items);
        System.out.println("**********************************************************");
    
        System.out.println();
        System.out.println("Do you want to do it again? (Y/N): ");
                String repeatChoice = sc.nextLine();
                if (!repeatChoice.equalsIgnoreCase("Y")) {
                    break;
            }
        }
    }
}