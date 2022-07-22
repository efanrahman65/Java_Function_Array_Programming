
/* Input an amount from the user and find out the number of notes from input amount in given array */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NotesCount {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int notes[] = {1000, 500, 200, 100, 50, 20, 10,5,2,1};
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter the Amount: ");
        int amount = obj.nextInt();
        
        Map<Integer, Integer> countNotes = new HashMap<>();
        
        for(int i=0;i<notes.length;i++){
        
                while(notes[i]<=amount){
                    if(countNotes.containsKey(notes[i])){
                        countNotes.put(notes[i], countNotes.get(notes[i])+1);
                    }
                    else{
                        countNotes.put(notes[i], 1);
                    }
                    
                    amount-=notes[i];
                        
                }
        }
        
        for(Map.Entry<Integer, Integer> e : countNotes.entrySet()){
                    System.out.print(e.getKey());
                    System.out.print(" ");
                    System.out.println(e.getValue());
        
        }
    }
    
}
