//Creates LinkedList and has methods like modify entries, add entries, delete entries, etc

package phonebook;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class phonebookManager {
    //Initialize variables
    Scanner input = new Scanner(System.in);
    List<listNode> bellinghamPhoneNum = new LinkedList<>();
    String firstName;
    String lastName;
    String address;
    String city;
    String phoneNumber;
    listNode person;
    
    //Let the user add entries
    public void addEntry() { //start of addEntry
        String newEntry = "y";
        
        //Add at least one new entry
        do {
            setFirstName();
            setLastName();
            setAddress();
            setCity();
            setPhoneNumber();
            
            person = new listNode(firstName, lastName, address, city, phoneNumber);
            bellinghamPhoneNum.add(person);

            System.out.println("Would you like to add a new entry? y/n ");
            newEntry = input.next();
        } while (newEntry.equals("y"));

    } //end of addEntry

    public void setFirstName() { //start of setFirstName
        System.out.println("What is the person's first name?");
        firstName = input.next();
    } //end of setFirstName

    public void setLastName() { //start of setLastName
        System.out.println("What is the person's last name?");
        lastName = input.next();
    } //end of setLastName

    public void setAddress() { //start of setAddress
        System.out.println("What is the person's address? ex: 1234 Apple St.");
        address = input.next();
        address = address.concat(" "); 
        address = address.concat(input.next()); 
        address = address.concat(" "); 
        address = address.concat(input.next()); 
        
    } //end of setAddress

    public void setCity() { //start of setCity
        System.out.println("What is the person's city?");
        city = input.next();
    }//end of setCity

    public void setPhoneNumber() { //start of setPhoneNumber
        System.out.println("What is the person's phone number?");
        phoneNumber = input.next();
    } //end of setPhoneNumber

    /*public void insertSort() {
        for (int i = 0; i < )
    }
*/

    public String toString() {
        String allPeople = "Phone Book: \n";
        for (listNode person : bellinghamPhoneNum) {
            allPeople = allPeople.concat(person.toString());
            allPeople = allPeople.concat("\n \n");
        }
        return allPeople;
    }
}
