package Operations;
import java.util.Random;
public class CredentialService {
    private String email;
    private String password = "";
    private String domain = "greatlerning.in" ;
    private String department;
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
    public String getDepartment() {
        return department;
    }
    public String generateEmailAddress(String firstName, String lastName){
        this.email = firstName + lastName + "@" + this.department + "." + this.domain;
        return email;
    }
    public String generatePassword(){
        String capitalChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallChar = "abcdefghijklmnopqrstuvwxyz";
        String number = "0123456789";
        String specialChar = "!@#$%^&*.,;:+='";
        Random random = new Random();
        for (int j = 0; j < 2; j++){
            Character selected = capitalChar.charAt(random.nextInt(capitalChar.length()));
            this.password = this.password + selected;
        }
        for (int k = 0; k < 2; k++){
            Character selected = number.charAt(random.nextInt(number.length()));
            this.password = this.password + selected;
        }
        for (int l = 0; l < 2; l++){
            Character selected = specialChar.charAt(random.nextInt(specialChar.length()));
            this.password = this.password + selected;
        }
        for (int m = 0; m < 2; m++){
            Character selected = smallChar.charAt(random.nextInt(smallChar.length()));
            this.password = this.password + selected;
        }
        return password;
    }

}
