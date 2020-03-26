package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_List {

	public static void main(String[] args) {
		
		ArrayList<String> listA = new ArrayList<String>();

		listA.add("Kumar");
		listA.add("Sujoy");
		listA.add("John");
		listA.add("Sujoy");

		//access via Iterator
		Iterator ite = listA.iterator();
		while(ite.hasNext())
		{
		  String name = (String) ite.next();
		  System.out.println(name);
		}
	}


	}

