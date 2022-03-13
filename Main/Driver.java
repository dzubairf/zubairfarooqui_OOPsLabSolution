package Main;
import Employee.Employee;
import Operations.CredentialService;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName = sc.nextLine().replaceAll(" ", "");
        System.out.println("Please enter your last name");
        String lastName = sc.nextLine().replaceAll(" ", "");;
        System.out.println("Please enter the department from the following");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resources");
        System.out.println("4. Legal");
        int departmentNo = sc.nextInt();
        Employee employee = new Employee(firstName, lastName);
        CredentialService credentialService =  new CredentialService();
        // Setting Department
        credentialService.setDepartment(departmentNo);
        // Generating email address
        String email = credentialService.generateEmailAddress(firstName, lastName);
        // Generating Password
        String password =  credentialService.generatePassword();
        System.out.println("Email --> " + email);
        System.out.println("Password --> " + password);
    }
}
