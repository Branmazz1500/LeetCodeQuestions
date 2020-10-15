package easyAugust7th;

import java.util.HashMap;

public class IsoMorphic {
    public static boolean isIsomorphic(String s, String t) {
    	 
        HashMap<String,String> sMap = new HashMap<String,String>();

        for(int i = 0; i<s.length(); i++){
            String c = s.substring(i,i+1);
            String tC = t.substring(i,i+1);
            
            if(sMap.containsKey(c)){
                if(!sMap.get(c).equals(tC)){
                    return false;
                }
            }else{
            	if(sMap.containsValue(tC)) {
            		return false;
            	}
                sMap.put(c,tC);
            }
            
        
        }
  
        return true;
        
    }
    public static void main(String[] args) {
    	String s = "egg";
    	String t = "add";
    	System.out.println(isIsomorphic(s, t));
    }
}
