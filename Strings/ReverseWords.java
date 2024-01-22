public class ReverseWords {

    public static void main(String[] args) {

        String inputSentence = "Java J2EE Reverse Me";

        String reversedSentence = reverseWords(inputSentence);
        System.out.println("Input sentence: " + inputSentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }
    static String reverseWords(String sentence) {
        String[] words = sentence.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            words[i] = reverseString(words[i]);
        }
        return String.join(" ", words);
    }
    static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}