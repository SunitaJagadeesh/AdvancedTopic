package Collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap_Ex {

	public static void main(String[] args) {
		
		  TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Ram");    
	      map.put(101,"Ravi");    
	      map.put(102,"Raju");    
	      map.put(103,"Siva");    
	        
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }    
	 }  

	}

