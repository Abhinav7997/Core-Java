import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        int[] arr = new int[size];

        // Prompt the user to enter elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i+1) + ": ");
            arr[i] = s.nextInt();
        }

        System.out.println("\nOriginal Array:");
        int i=0;
        while(i<arr.length) {
            System.out.print(" "+arr[i]);
            i++;
        }

        System.out.println("\nReversed Array:");
        int j=arr.length-1;
        while(j>=0) {
            System.out.print(" "+arr[j]);
            j--;
        }


    }


}