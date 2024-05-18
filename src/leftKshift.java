import java.util.ArrayList;
import java.util.Scanner;

public class leftKshift {
    public static void leftShift(ArrayList<Integer> arr3, int n) {
        ArrayList arr1 = (ArrayList)arr3.clone();
        arr1.add(5);
        System.out.print(arr1);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the size of the array = ");
        int n= sc.nextInt();
        System.out.print(" Enter the number of elements in the array = ");
        ArrayList<Integer> arr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            arr.add(i);
        }
        leftShift(arr,n);
    }
}