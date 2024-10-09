package Task1;

public class Customer{

    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter = 1;

    public Customer(String firstName, String lastName, String username){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = counter++; //add 1 to counter every time the class is called (gives it a unique ID) because counter is static

    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){ //getters and setters for all three variables
        this.username = username;
    }

    public String toString(){
        String stringpart1 = "Fornavn: " + this.firstName + "\n";
        String stringpart2 = "Efternavn: "+ this.lastName + "\n";
        String stringpart3 = "Brugernavn: " + this.username + "\n";
        String stringpart4 = "ID: " + this.id + "\n";
        return stringpart1 + stringpart2 + stringpart3 + stringpart4;
    }

}



