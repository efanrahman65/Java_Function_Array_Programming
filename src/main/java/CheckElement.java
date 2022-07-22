
/*Take input from a user and check if the number exists in the array */

import java.util.Scanner;

public class CheckElement {

    
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,2,4,6,8};
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter the Number: ");
        int num = obj.nextInt();
        int pos = -1;
        for(int ele=0; ele<arr.length;ele++){
                if(arr[ele]==num){
                    pos=ele;
                    break;
                }
                System.out.println("Found in the position "+pos);
        }
        if(pos==-1){       
            System.out.println("Found no Element");
        }
        
        else
        {
            System.out.println("Found in the position "+pos);
        }
    }
    
}
