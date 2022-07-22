
import java.util.HashMap;
import java.util.Map;


/* Creating a bazar list/pocket expenditure which includes the item name and price. */
public class BazarList {
    
    public static int searchItem(String str, Map<String, Integer> bazar){
    
            for(String key:bazar.keySet()){
                
                    if(key==str){
                    
                        return bazar.get(key);
                    }
            }
            return 0;
    }
    
    public static void main(String[] args) {
        Map<String, Integer> bazar = new HashMap<>();
        bazar.put("potato", 60);
        bazar.put("biscuit", 70);
        bazar.put("chips", 20);
        bazar.put("chicken", 560);
        bazar.put("fish", 440);
        bazar.put("egg", 120);
        int res = searchItem("eg", bazar);
        if(res==0){
            System.out.println("Item not found");
        }
        else{
        System.out.println(searchItem("egg", bazar));
        }
    }
    
}
