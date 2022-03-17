package Operations;
import java.util.Random;
public class CredentialService {
    String email;
    String password = "";
    final String domain = "mygreatlearning.com" ;
    String department;
    public void setDepartment(int department) {
        switch (department){
            case 1:
                this.department = "tech";
                break;
            case 2:
                this.department = "admin";
                break;
            case 3:
                this.department = "hr";
                break;
            case 4:
                this.department = "legal";
                break;
            default:
                System.out.println("undefined");
        }
    }
    public String generateEmailAddress(String firstName, String lastName){
        this.email = (firstName + lastName + "@" + this.department + "." + this.domain).replaceAll(" ", "");
        return email;
    }
    public String generatePassword(){
        String capitalChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallChar = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String specialChar = "!@#$%^&*.,;:+='";
        Random random = new Random();
        for (int j = 0; j < 2; j++){
            String selected = String.valueOf(capitalChar.charAt(random.nextInt(capitalChar.length())));
            this.password = this.password.concat(selected);
            Character selected1 = number.charAt(random.nextInt(number.length()));
            this.password = this.password.concat(String.valueOf(selected1));
            Character selected2 = specialChar.charAt(random.nextInt(specialChar.length()));
            this.password = this.password.concat(String.valueOf(selected2));
            Character selected3 = smallChar.charAt(random.nextInt(smallChar.length()));
            this.password = this.password.concat(String.valueOf(selected3));
        }
        return password;
    }

}
