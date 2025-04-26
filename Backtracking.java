class Backtracking {
    // Prints all permutations of the given string
    public static void printPermutation(String str, String perm, int idx) {
        if (str.length() == 0) { // Base case: when no characters are left
            System.out.println(perm); // Print the formed permutation
            return; // End the function call
        }
        
        for (int i = 0; i < str.length(); i++) { // Loop over each character
            char currChar = str.charAt(i); // Pick the current character
            String newStr = str.substring(0, i) + str.substring(i + 1); // Remove picked character
            printPermutation(newStr, perm + currChar, idx + 1); // Recursive call with updated strings
        }
    }

    public static void main(String args[]) {
        String str = "ABC"; // Input string to permute
        printPermutation(str, "", 0); // Initial call with empty permutation and index 0
    }
}
