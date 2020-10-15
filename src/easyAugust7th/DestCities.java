package easyAugust7th;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//[["A","B"],["C","D"],["B","E"],["E","C"],["D","F"]]

public class DestCities {
	public static String destCity(List<List<String>> paths) {
		
        String currentLocation = paths.get(0).get(1);
        Map<String,String> cities = new HashMap<String,String>();
        cities.put(paths.get(0).get(0),paths.get(0).get(1));
        
        for(int i = 1; i<paths.size(); i++){
        	if(currentLocation.equals(paths.get(i).get(0))) {
        		currentLocation = paths.get(i).get(1);
        		String key = currentLocation;
        		while(cities.containsKey(currentLocation)) {
        			currentLocation = cities.get(key);
        			key = currentLocation;
        		}
        		cities.put(paths.get(i).get(0),paths.get(i).get(1));
        	}else if(paths.get(i).get(0) != currentLocation) {
        		cities.put(paths.get(i).get(0),paths.get(i).get(1));
        	}
        	
        }
        return currentLocation;
    }
	
	
	
	public static void main(String[] args) {
		List<List<String>> paths = new ArrayList<List<String>>();
		List<String> a = new ArrayList<String>();
		a.add("A"); a.add("B");
		paths.add(a);
		List<String> c= new ArrayList<String>();
		c.add("C"); c.add("D");
		paths.add(c);
		List<String> b= new ArrayList<String>();
		b.add("B"); b.add("E");
		paths.add(b);
		List<String> e= new ArrayList<String>();
		e.add("E"); e.add("C");
		paths.add(e);
		List<String> d= new ArrayList<String>();
		d.add("D"); d.add("F");
		paths.add(d);
		
		System.out.println(destCity(paths));
		
	}
}
