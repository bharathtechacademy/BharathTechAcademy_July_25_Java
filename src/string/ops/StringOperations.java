package string.ops;

public class StringOperations {

	public static void main(String[] args) {
		
		// Store String Value
		String value = " Username : Admin | Password : admin123 ";
		
		// Total number of characters available within the string.==> String.length();
		System.out.println("Total number of characters available within the string : " + value.length());
		
		// Get a specific character from a specific index of a string.==> String.charAt(index);
		System.out.println("Character available at index 5 : " + value.charAt(5));
		
		// Print the reverse string of the original value.
		String reverseValue = "";
		for(int i=value.length()-1;i>=0;i--) {
			reverseValue = reverseValue + value.charAt(i);
		}
		System.out.println("Reverse string of the original value : " + reverseValue);
		
		// Remove the unwanted spaces within the string. ==> String.trim();
		System.out.println("String before removing unwanted spaces :" + value);
		System.out.println("String after removing unwanted spaces :" + value.trim());
		
		//Removing all the spaces from the string.==> String.replace(oldChar, newChar);
		System.out.println("String after removing all the spaces :" + value.replace(" ", ""));
		
		//Removing all the ALPHABETS from the string.==> String.replaceAll(regExp, newChar);
		System.out.println("String after removing all the alphabets :" + value.replaceAll("[a-zA-Z]", ""));
		
		//Removing all the NUMBERS from the string.==> String.replaceAll(regExp, newChar);
		System.out.println("String after removing all the numbers :" + value.replaceAll("[0-9]", ""));
		
		//Removing all the SPECIAL CHARS from the string.==> String.replaceAll(regExp, newChar);
		System.out.println("String after removing all the special chars :" + value.replaceAll("[^0-9a-zA-Z]", ""));
		
		// Change the case of characters within the string.==> String.toLowerCase() / String.toUpperCase();
		System.out.println("String after converting to lower case :" + value.toLowerCase());
		System.out.println("String after converting to upper case :" + value.toUpperCase());
		
		// Extract the substring from the string.==> String.substring(startIndex, endIndex+1);
		System.out.println("Username:" + value.substring(12, 17));
		System.out.println("Password:" + value.substring(31));
		
		// Extract the username and password from the dynamic string and print them separately.
		String [] values = value.split(" ");
		System.out.println("Username:" + values[3]);
		System.out.println("Password:" + values[7]);
		
		// Compare the Strings ==>equals (for exact match including case) / equalsIgnoreCase (for exact match without case) / contains (for partial match)
		// startsWith, endsWith ==> to check whether the string starts or ends with a specific sequence of characters
		
		String name = "Bharath";		
		System.out.println(name.equals("Bharath")); // true
		System.out.println(name.equals("bharath")); // false
		System.out.println(name.equalsIgnoreCase("bharath")); // true
		System.out.println(name.contains("hara"));//true
		System.out.println(name.contains("Hara"));//false
		System.out.println(name.startsWith("Bha"));//true
		System.out.println(name.endsWith("rath"));//true
				
				

	}

}
