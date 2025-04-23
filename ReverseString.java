public class ReverseString {

    public static String reverse(String str) {
        // Base case: empty string or single character
        if (str.isEmpty()) {
            return str;
        }

        // Recursive case: reverse the rest and add the first character at the end
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String input = "hello";
        String reversed = reverse(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
