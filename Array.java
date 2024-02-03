import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Arrays.fill(arr, 10);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i = i + 2) {
            arr[i] = 20;
        }
        System.out.println(Arrays.toString(arr));
        arr[4] = 30;
        System.out.println(Arrays.binarySearch(arr, 30));
        int arr2[] = { 20, 10, 20, 10, 30 };
        System.out.println(Arrays.equals(arr, arr2));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        int arr3[] = Arrays.copyOf(arr, 7);
        arr3[6] = 40;
        System.out.println(Arrays.toString(arr3));
        int arr4[] = Arrays.copyOfRange(arr3, 1, 4);
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }
}
