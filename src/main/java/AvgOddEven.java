
public class AvgOddEven {
    
    static double average(int[] arr){
                int sum=0;
                for(int i=0; i<arr.length; i++){
                
                        sum+=arr[i];
                }
              return (float)sum/arr.length;
    }
   
    static int countEvenNumbers(int[] arr){
            
            int even=0;
            for(int i=0; i<arr.length; i++){
                
                        if(arr[i]%2==0){
                        even+=1;
                        }
                }
            return even;
    }
    
    static int countOddNumbers(int[] arr){
            
            int odd=0;
            for(int i=0; i<arr.length; i++){
                
                        if(arr[i]%2==0){
                        odd+=1;
                        }
                }
            return odd;
    }
    
    public static void main(String[] args) {
        int arr[] = {2, 5, 7, 8, 10};
        System.out.println(average(arr));
        System.out.println(countEvenNumbers(arr));
        System.out.println(countOddNumbers(arr));
    }
    
}
