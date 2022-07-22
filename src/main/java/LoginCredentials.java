
import java.util.Scanner;

/* Login credentials */

public class LoginCredentials {

    public static void main(String[] args) {
        int count = 0;
        Scanner obj = new Scanner(System.in);

        int flag=0;
        for(int i=0;i<3;i++){
            System.out.println("Enter Username: ");
            String username = obj.nextLine();
            System.out.println("Enter Password: ");
            String password = obj.nextLine();
            System.out.println(username);
            System.out.println(password);
            if("admin" == username && password=="adm1n"){
                    System.out.println("Logged in");
                    flag=1;
                    break;
        
        }
        
        }
        
        if(flag==0){
                System.out.println("Your user has been temporary locked");
        }
        
    }
    
}
