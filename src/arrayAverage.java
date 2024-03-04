import java.util.*;
public class arrayAverage {
    public static int average(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        int avg = sum/arr.length;
        System.out.print( " Average = ");
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the size of the array = ");
        int n = sc.nextInt();

        int []arr = new int[n];
        System.out.print("Enter the number of elements = ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(average(arr));
    }

}
