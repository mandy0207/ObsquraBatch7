package javaBasics;

import java.util.ArrayList;
import java.util.List;

public class DataTypeUnderstanding {

	public static void main(String [] args) {
		
		 int a =3;
		// String name= "mandy";
		 
		List<String> names = new ArrayList<String>();
		
		names.add("mandy");
		names.add("cadny");
		
		for(String name : names) {
			System.out.println(name);
		}
	}
}
