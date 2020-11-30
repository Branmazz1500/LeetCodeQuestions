package MediumQuestions;

import java.util.HashMap;

public class UnderGround {
	   HashMap<String, int[]> cityAverage = new HashMap<>();
	   HashMap<Integer, HashMap<String, Integer>> checkedIn = new HashMap<>(); 
	    public UnderGround() {
	        
	    }
	    
	    public void checkIn(int id, String stationName, int t) {
	    	HashMap<String,Integer> c = new HashMap<>();
	    	c.put(stationName, t);
	        checkedIn.put(id, c);
	    }
	    
	    public void checkOut(int id, String stationName, int t) {
	    	int checkInSum = 0;
	    	int checkOutSum = 0;
	    	int count = 0;
	    	if(cityAverage.containsKey(stationName)) {
	    		 checkInSum = cityAverage.get(stationName)[0];
	    		 checkOutSum = cityAverage.get(stationName)[1];
	    		 count = cityAverage.get(stationName)[2];
	    	}
	    	int[] times = new int[] {checkInSum + checkedIn.get(id).get(stationName), checkOutSum + t, count + 1};
	        cityAverage.put(stationName, times);
	        
	    }
	    
	    public double getAverageTime(String startStation, String endStation) {
	    	
	        return 0.0;
	    }
}
