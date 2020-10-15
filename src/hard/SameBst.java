package hard;
import java.util.*;

public class SameBst {
	  public static boolean sameBsts(List<Integer> arrayOne, List<Integer> arrayTwo) {
			if((arrayOne.get(0) != arrayTwo.get(0)) || (arrayOne.size() != arrayTwo.size())){
				return false;
			}
			HashMap<Integer,Integer> arr1 = new HashMap<Integer,Integer>();
			HashMap<Integer,Integer> arr2 = new HashMap<Integer,Integer>();

			for(int i = 0; i<arrayOne.size(); i++){
				if(arr1.containsKey(arrayOne.get(i))){
					arr1.put(arrayOne.get(i), arr1.get(arrayOne.get(i)) + 1);
				}else{
					arr1.put(arrayOne.get(i), 1);
				}
				
				if(arr2.containsKey(arrayTwo.get(i))){
					arr2.put(arrayTwo.get(i), arr2.get(arrayTwo.get(i)) + 1);
				}else{
					arr2.put(arrayTwo.get(i), 1);
				}
			}
			
			if(arr1.equals(arr2)){
				return true;
			}
			return false;
	  }
	  
	  public static void main(String[] args) {
		  List<Integer> a1 = new ArrayList<Integer>();
		  List<Integer> a2 = new ArrayList<Integer>();
		  
		  a1.addAll(Arrays.asList(10, 15, 8, 12, 94, 81, 5, 2, -1, 100, 45, 12, 9, -1, 8, 2, -34));
		  a2.addAll(Arrays.asList(10, 8, 5, 15, 2, 12, 94, 81, -1, -1, -34, 8, 2, 9, 12, 45, 100));
		  
		  System.out.println(sameBsts(a1,a2));
	  }
}
