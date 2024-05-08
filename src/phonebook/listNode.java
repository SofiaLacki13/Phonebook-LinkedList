//List node is to create the object for each person, like getfirstname, setaddress, etc
package phonebook;

public class listNode {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String phoneNumber;

    public listNode(String firstName, String lastName, String address, String city, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCity() {
        return this.city;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %s%n%s: %s",
            "Name", getFirstName(), getLastName(),
            "Address",getAddress(),
            "City", getCity(),
            "Phone Number", getPhoneNumber() );
    }

}
