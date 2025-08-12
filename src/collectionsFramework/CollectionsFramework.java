package collectionsFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsFramework {
	
	//Arrays in Java.
	
	// Array is a data type , that can store multiple values with similar data type together at one place.

	public static void main(String[] args) {
		
		/**** Challenges with Arrays ****/

		String [] empNames = new String[3]; // Syntax to create an array in Java
		empNames[0] = "Bharath"; // Syntax to assign a value to an array element
		empNames[1] = "ABC";
		empNames[2] = "XYZ";	
		System.out.println(empNames.length);// Syntax to get the size of an array
		System.out.println(empNames[0]);// Syntax to access an array element
		
		// 1. Arrays are fixed in size
		// 2. Memory will be allocated at the beginning of creating array / static memory allocation
		// 3. Array allows similar data types only
		// 4. Modifications also not allowed
		
		/***********Collections Framework in Java************/
		
		// Advantages
		
		// 1. Collections are dynamic in size. that means , no need to declare the size at the beginning
		// 2. Memory will be allocated dynamically based on the data that we are going to add/store
		// 3. Collections can hold different data types together
		// 4. Modifications are allowed
		
		// Major Collection Categories ==> List , Set , Map 
		
		// List ==> ArrayList , LinkedList		
		// 1. List can store multiple values with similar data type together at one place by allocating the memory dynamically
		// 2. List allows duplicate values
		// 3. List can follow dynamic memory allocation
		// 4. List allows modifications
		
		// Set ==> HashSet , LinkedHashSet , TreeSet		
		// 1. Set can store multiple values with similar data type together at one place by allocating the memory dynamically
		// 2. Set Won't allow duplicate values
		// 3. Set can follow dynamic memory allocation
		// 4. Set allows modifications		
		
		// Map ==> HashMap , LinkedHashMap , TreeMap, Hashtable
		// 1. Map can store multiple values with different data type together in the form of Key and Value at one place by allocating the memory dynamically
		// 2. Map can follow dynamic memory allocation
		// 3. Map allows modifications
		// 4. Map won't allow duplicate keys, but allows duplicate values
		
		// Each and every collection concept or each and every collection class will differ based on the way that we are going to allocate the memory, 
		 //the way that we are going to allow null values, the way that we are going to arrange the values while storing.
		
		// 1. Memory allocation
		// 2. Null values
		// 3. Arranging the values while storing
		
		//collections allows only dynamic datatypes (primitive data types are not allowed)
		
		/****************WRAPPER CLASSES*****************/
		// Java provides wrapper classes to convert primitive data types into dynamic data types.
		// Wrapper classes are used to convert primitive data types into dynamic data types.
		
		// byte ==> Byte
		// short ==> Short
		// int ==> Integer
		// long ==> Long
		// float ==> Float
		// double ==> Double
		// char ==> Character
		// boolean ==> Boolean
		
		
		/************************  ArrayList  *************************/
		System.out.println("************************  ArrayList  *************************");			
		
		// Syntax to Initialize an ArrayList:  List<DataType> variable = new ArrayList<DataType>();  
		// Syntax to add data: variable.add(value);
		// Syntax to remove data: variable.remove(value);
		// Syntax to get data: variable.get(index);
		// Syntax to get size: variable.size();
		
		// ArrayList follow insertion order, which means the order in which we add the values will be maintained while printing.
		// ArrayList allows duplicate values, which means we can add the same value multiple times.
		// ArrayList allows null values, which means we can add null value to the ArrayList.
		
		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("Bharath");
		empNamesArrayList.add("John");
		empNamesArrayList.add("Sony");
		empNamesArrayList.add("Bharath"); // Adding duplicate value
		empNamesArrayList.add("Sarath");
		empNamesArrayList.add(null); // Adding null value
		empNamesArrayList.remove("John"); // Removing a value
		
		System.out.println("Size of ArrayList: " + empNamesArrayList.size()); // Getting the size of ArrayList
		System.out.println("First element in ArrayList: " + empNamesArrayList.get(0)); // Accessing the first element in ArrayList
		System.out.println("All elements in ArrayList: " + empNamesArrayList); // Printing all elements in ArrayList
		
		
		/************************  LinkedList  *************************/
		
		System.out.println("************************  LinkedList  *************************");			
		
		// Syntax to Initialize an LinkedList:  List<DataType> variable = new LinkedList<DataType>();  
		// Syntax to add data: variable.add(value);
		// Syntax to remove data: variable.remove(value);
		// Syntax to get data: variable.get(index);
		// Syntax to get size: variable.size();
		
		// LinkedList follow insertion order, which means the order in which we add the values will be maintained while printing.
		// LinkedList allows duplicate values, which means we can add the same value multiple times.
		// LinkedList allows null values, which means we can add null value to the LinkedList.
		
		List<String> empNamesLinkedList = new LinkedList<String>();
		empNamesLinkedList.add("Bharath");
		empNamesLinkedList.add("John");
		empNamesLinkedList.add("Sony");
		empNamesLinkedList.add("Bharath"); // Adding duplicate value
		empNamesLinkedList.add("Sarath");
		empNamesLinkedList.add(null); // Adding null value
		empNamesLinkedList.remove("John"); // Removing a value
		
		System.out.println("Size of LinkedList: " + empNamesLinkedList.size()); // Getting the size of LinkedList
		System.out.println("First element in LinkedList: " + empNamesLinkedList.get(0)); // Accessing the first element in LinkedList
		System.out.println("All elements in LinkedList: " + empNamesLinkedList); // Printing all elements in LinkedList
		
		
		}

}
