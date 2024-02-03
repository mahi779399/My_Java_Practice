import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class MiniDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int k = sc.nextInt();
        System.out.println("Enter length of array: ");
        int n = sc.nextInt();
        System.out.println("Enter array elements as per length: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Random rd = new Random();
        int[] arr1 = { k, -k };
        System.out.println(Arrays.toString(arr1));
        for (int i = 0; i < n; i++) {
            int j = rd.nextInt(2);
            arr[i] = arr[i] - arr1[j];
            if (arr[i] < 0) {
                arr[i] = arr[i] + (2 * k);
            }
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
        int max = 0, min = arr[0];
        for(int i=0;i<n;i++){
            if (arr[i] > max) {
                max = arr[i];
            }
            if(arr[i]<min) {
                min = arr[i];
            }    
        }
        System.out.println(max+"   "+min);
        System.out.println("Mini Difference: " + (max - min));
    }
}
