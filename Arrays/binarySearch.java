
public class binarySearch {

    public static void main(String[] args) {

        int[] arr = {21, 13, 22, 18, 54, 48, 99};

        System.out.println("Sorted Array:");
        displayArray(arr);

        int i = 18;

        int index = binarySearchArray(arr, i);


        if (index != -1) {
            System.out.println("\nElement " + i + " found at index " + index);
        } else {
            System.out.println("\nElement " + i + " not found in the array");
        }
    }


    private static int binarySearchArray(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }

    private static void displayArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}