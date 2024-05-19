import java.util.Arrays;

public class largestElementArray {
    public static void main(String[] args) {
        int []arr = {5,8,1,3,7,4};
        largest(arr);
    }
    public static void largest(int arr[]) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]);
    }
}
