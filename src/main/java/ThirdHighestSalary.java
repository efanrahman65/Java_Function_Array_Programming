
/* Find out the 3rd highest salary from an array */

import java.util.Arrays;

public class ThirdHighestSalary {
    
    public static void main(String[] args) {
           int arr[] = {35000, 25000, 28000, 32500, 44000, 32800};
           Arrays.sort(arr);
           System.out.println(arr[arr.length-3]);
        }
    
}
