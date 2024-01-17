public class ReverseNumber {

    public static void main(String[] args) {
        int input = 12345;
        int reverseNumber = 0;
        while(input>0) {
            int r = input%10;
            reverseNumber = reverseNumber*10+r;
            input = input / 10;
        }
        System.out.println(reverseNumber);
    }
}
