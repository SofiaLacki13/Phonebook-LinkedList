//Extra credit: put sorting method
import phonebook.*;

public class PhonebookTest {
    public static void main(String[] args) throws Exception {
        
        System.out.println("This is your Bellingham phonebook,");
        System.out.println("where you can keep logs of all your");
        System.out.println("contacts who reside in Bellingham \n");

        System.out.println("Your phonebook is currently empty.");
        System.out.println("Let's change that! \n");

        phonebookManager manager = new phonebookManager();

        manager.addEntry();

        System.out.println(manager);
    }
}
