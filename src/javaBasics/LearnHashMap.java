package javaBasics;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class LearnHashMap {

	@Test
	public void learnHashMap() {

    Map<String, String > nameMap = new HashMap<String, String>();
    nameMap.put("name", "Maninder");
    nameMap.put("age", "31");
    
    System.out.println(nameMap);
    
    System.out.println(nameMap.get("name"));
   
    System.out.println(nameMap.get("age"));
	}
}
