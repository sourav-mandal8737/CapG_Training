package Strings;

/*public class Demo {
	public static void main(String[] args) {
		String s1="hello";
		String s2=new String("hello");
		char[] arr= {'J','a','v','a'};
		String s3=new String(arr);
		System.out.println(s1+" "+s2+" "+s3);
	}

}*/


public class Demo {
    public static void main(String[] args) {
        
        // 1. Creating Strings
        String str1 = "Hello";
        String str2 = new String("World");

        // 2. Concatenation
        String message = str1 + " " + str2; // Using '+' operator
        String message2 = str1.concat(" ").concat(str2); // Using concat() method
        System.out.println("Concatenation: " + message);
        System.out.println("Concatenation using concat(): " + message2);

        // 3. String Length
        System.out.println("Length of str1: " + str1.length()); // 5
        System.out.println("Length of str2: " + str2.length()); // 5

        // 4. String Comparison
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // false
        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2)); // false
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // Negative value (case-sensitive)
        System.out.println("str1.compareToIgnoreCase(str2): " + str1.compareToIgnoreCase(str2)); // Negative value (case-insensitive)

        // 5. Substring
        String subStr1 = str1.substring(1); // "ello"
        String subStr2 = str2.substring(0, 3); // "Wor"
        System.out.println("Substring from str1: " + subStr1);
        System.out.println("Substring from str2: " + subStr2);

        // 6. Character at a Specific Position
        System.out.println("Character at index 2 in str1: " + str1.charAt(2)); // 'l'

        // 7. Uppercase and Lowercase
        System.out.println("Uppercase str1: " + str1.toUpperCase()); // "HELLO"
        System.out.println("Lowercase str2: " + str2.toLowerCase()); // "world"

        // 8. Trimming Whitespace
        String str3 = "  Hello, World!  ";
        System.out.println("Trimmed string: '" + str3.trim() + "'"); // "Hello, World!"

        // 9. Replacing Substrings
        String replacedStr = str1.replace("l", "1"); // "He11o"
        String replacedStr2 = str2.replaceAll("o", "0"); // "W0rld"
        System.out.println("Replaced str1: " + replacedStr);
        System.out.println("Replaced str2: " + replacedStr2);

        // 10. Splitting Strings
        String str4 = "apple,banana,orange";
        String[] fruits = str4.split(",");
        System.out.println("Fruits array: ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 11. Checking String Containment
        System.out.println("str1 contains 'ell': " + str1.contains("ell")); // true

        // 12. String Index of Substring
        System.out.println("Index of 'World' in str3: " + str3.indexOf("World")); // 7
        System.out.println("Last index of 'o' in str1: " + str1.lastIndexOf('o')); // 3

        // 13. Starts with/Ends with
        System.out.println("str1 starts with 'He': " + str1.startsWith("He")); // true
        System.out.println("str2 ends with 'ld': " + str2.endsWith("ld")); // true

        // 14. String Join (Java 8 and above)
        String[] words = {"apple", "banana", "cherry"};
        String result = String.join(", ", words);
        System.out.println("Joined string: " + result); // "apple, banana, cherry"

        // 15. StringBuilder Example
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", ").append("World!"); // "Hello, World!"
        System.out.println("StringBuilder result: " + sb.toString());

        // 16. String Format
        int age = 25;
        String formatted = String.format("I am %d years old.", age);
        System.out.println("Formatted String: " + formatted); // "I am 25 years old."

        // 17. Checking if String is Empty or Blank
        String str5 = "";
        String str6 = "   ";
        System.out.println("Is str5 empty? " + str5.isEmpty()); // true
        System.out.println("Is str6 blank? " + str6.isBlank()); // true

        // 18. Convert String to Char Array
        char[] chars = str1.toCharArray();
        System.out.print("Chars in str1: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

    }
}







