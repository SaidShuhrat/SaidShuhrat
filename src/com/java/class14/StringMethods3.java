package com.java.class14;

public class StringMethods3 {
	public static void main(String args[]) {
		// 1. Checking equality of String
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println("1. " + s1.equals(s2)); // True

		// 2. Checking equality of String
		String s3 = "hello";
		System.out.println("2. " + s1.equals(s3)); // False
		System.out.println("2. " + s1.equalsIgnoreCase(s3)); // True (IgnoreCase)

		// 3. Changing the case of String
		System.out.println("3. Upper Case " + s1.toUpperCase()); // Upper Case HELLO
		System.out.println("3. Lower case " + s1.toLowerCase()); // Lower Case hello

		// 4. Changing the case of String
		String s4 = "Hello Chirag, How are you?";
		String s4Upper = s4.toUpperCase();
		String s3Upper = s3.toUpperCase();
		System.out.println("4. Contains - " + s4.contains(s3)); // Containes - False
		System.out.println("4. Contains - " + s4.toUpperCase().contains(s3.toUpperCase())); // Contains - True
		System.out.println("4. Contains - " + s4Upper.contains(s3Upper)); // Contains - True

		// 5. Index of character
		System.out.println("5. Index of - " + s4.indexOf(','));
		System.out.println("5. Index of - " + s4.indexOf("Chirag"));
		System.out.println("5. Index of - " + s4.lastIndexOf(" "));

		// 6. Character at particular ındex
		System.out.println("6. Character at index - " + s4.charAt(6));

		// 7. Length of String
		System.out.println("7. Length of String - " + s4.length());

		// 8. SubString
		System.out.println("8. Sub String - " + s4.substring(5));
		System.out.println("8. Sub String - " + s4.substring(5, 12));

		System.out.println("8. Sub String - " + s4.substring(14, 26));
		System.out.println("8. Sub String - " + s4.substring(s4.indexOf(", ") + 2));

		// 9. Empty
		String s5 = "";
		String s6 = "    ";
		System.out.println("9. Empty - " + s5.isEmpty()); // True
		System.out.println("9. Empty - " + s6.isEmpty()); // False
		System.out.println("9. Empty - " + s6.isBlank()); // True

		// 10. Replace
		String s7 = "Welcome ###";
		String username = "Chirag";
		System.out.println("10. Replace - " + s7.replace("###", username));

		String s8 = "Welcome ####";
		String username1 = "Mayram";
		String price = "USD 15";
		System.out.println("10. Replace - " + s8.replace("##", username1));

		// Replace based on regular expression
		System.out.println("10. ReplaceAll - " + price.replaceAll("[0-9]", ""));
		System.out.println("10. ReplaceAll - " + price.replaceAll("[A-Z]", ""));

		// 11. Format
		String s9 = "Welcome %s";
		System.out.println("11. Format - " + String.format(s9, username1));

		String s10 = "Welcome %s %s";
		System.out.println("11. Format - " + String.format(s10, username1, username1));
		System.out.println("11. Format - " + String.format(s10, username1, "Chirag"));

		// 12. Split
				String s11 = "My name is - Chirag - SprintQA -Instructor";
				String parts[] = s11.split("-");
				System.out.println(parts[3]);
				System.out.println(parts.length);
	}
}