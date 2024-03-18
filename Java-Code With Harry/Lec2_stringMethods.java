public class Lec2_stringMethods {
    public static void main(String[] args) {
        // Define a sample string
        String str = "   Hello, World!   ";

        // Print the original string
        System.out.println("Original String: " + str);

        // Using length() method to find the length of the string
        System.out.println("Length of the String: " + str.length());

        // Using charAt() method to get the character at index 4
        System.out.println("Character at index 4: " + str.charAt(4));

        // Using substring() method to get a substring from index 7 to the end
        System.out.println("Substring from index 7: " + str.substring(7));

        // Using indexOf() method to find the index of 'W'
        System.out.println("Index of 'W': " + str.indexOf('W'));

        // Using contains() method to check if the string contains 'world'
        System.out.println("Contains 'world' (case-sensitive): " + str.contains("world"));
        System.out.println("Contains 'World' (case-insensitive): " + str.toLowerCase().contains("world"));

        // Using trim() method to remove leading and trailing whitespaces
        System.out.println("Trimmed String: " + str.trim());

        // Using replace() method to replace 'o' with 'x'
        System.out.println("String after replacing 'o' with 'x': " + str.replace('o', 'x'));

        // Using split() method to split the string by ','
        String[] parts = str.split(",");
        System.out.println("Splitting the string by ',':");
        for (String part : parts) {
            System.out.println(part.trim());
        }

        // Define two sample strings
        String str1 = "Hello";
        String str2 = "hello";

        // Using equals() method to compare strings
        System.out.println("Comparing '" + str1 + "' and '" + str2 + "' using equals(): " + str1.equalsIgnoreCase(str2));

        // Using equalsIgnoreCase() method to compare strings ignoring case differences
        System.out.println("Comparing '" + str1 + "' and '" + str2 + "' ignoring case: " + str1.equals(str2));
    }
}
