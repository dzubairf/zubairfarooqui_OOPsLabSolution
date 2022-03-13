package Employee;

public class Employee {
    String firstName;
    String lastName;
    public Employee(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Dear " + firstName + " " + lastName +  " your generated credentials are as follows");
    }
}
