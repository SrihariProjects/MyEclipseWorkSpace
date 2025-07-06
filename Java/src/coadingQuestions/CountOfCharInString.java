package coadingQuestions;

class Demo {
    public static String nochar(String str) {
        String result = "";
        // Loop through the string for each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;

            // Count the occurrences of the current character
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            // Append the character and its  count to the result
            if (!result.contains(String.valueOf(currentChar))) {
                result += currentChar + ":" + count + " ";
            }
        }
        return result;
    }
}

public class CountOfCharInString {
    public static void main(String[] args) {
        String name = "abbaca";
        Demo d = new Demo();
        System.out.println(d.nochar(name));
    }
}
