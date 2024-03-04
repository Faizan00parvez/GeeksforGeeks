import java.util.Scanner;

public class arraySorted {
    public static boolean isSorted(int []arr,int n) {
        for (int i = 1; i <=n ; i++) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of the array = ");
        int n = sc.nextInt();
        System.out.print("Enter the elements of Array = ");
        int []arr = new int[n];
        for (int i = 0; i <arr.length; i++) {
           arr[i] = sc.nextInt();
        }

        boolean ans = isSorted(arr,n);
        System.out.println(ans);
    }
}
