
public class Person {

    private String firstName;
    private String lastName;


    public Person(String name, String email, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        
    }

    public String getfirstName() {
        return firstName;
    }

    
    public String getEmail() {
        return lastName;
    }

    public void setlastName(String email) {
        this.lastName = email;
    }

    public String toString() {
        return firstName +  lastName;
    }
}