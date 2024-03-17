import java.util.Scanner;

public class leftShiftArray {
    public static void leftShift(int arr[], int n) {
        int []ans = new int[n];
        ans[n-1] = arr[0];

        for(int i=0;i<=n-2;i++) {
            ans[i] = arr[i+1];
        }
        for (int i=0; i<=n-1; i++) {
            System.out.print(ans[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the size of the array = ");
        int n= sc.nextInt();
        System.out.print(" Enter the number of elements in the array = ");
        int []arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        leftShift(arr,n);
    }
}
