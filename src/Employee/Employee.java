package Employee;

public class Employee {
    private String firstName;
    private String lastName;
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Dear " + firstName + " " + lastName +  " your generated credentials are as follows");
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }


}
