public class FibonacciGenerator {
    static void printFibonacciGenerator(int N) {
        int firstTerm = 0, secondTerm = 1;

        System.out.print("Fibonacci Series up to " + N + " terms: ");

        for (int i = 0; i < N; i++) {
            System.out.print(firstTerm + " ");

            int finalTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = finalTerm;
        }
    }


    public static void main(String[] args) {
       printFibonacciGenerator(10);
    }
}