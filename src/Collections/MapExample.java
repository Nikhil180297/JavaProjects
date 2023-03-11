package Collections;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         HashMap<String,Integer> basket = new HashMap<String,Integer>();
         
         basket.put("Item1", 1);
         basket.put("Item2", 5);
         basket.put("Item3", 2);
         basket.put("Item4", 2);
         
         System.out.println("The map is "+ basket); 
         
         basket.put("Item3", 3);
         
         System.out.println("The map after change is"+ basket);
         
         basket.remove("Item2");
         
         System.out.println("The map delete change is"+ basket);
         
         for(String item:basket.keySet()) {
        	 System.out.println("Item name is " + item);
 			System.out.println("Item quantity is " + basket.get(item));		
        }
         for(Integer val:basket.values()) {
        	 System.out.println("Value of the  is " + val);
	}
	}

}
