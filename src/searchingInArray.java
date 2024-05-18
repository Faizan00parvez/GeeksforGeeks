import java.util.*;
public class searchingInArray {
    public static void main(String[] args) {
        int []arr = {4, 5, 68, 10, 52};
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert an target elemennt = ");
        int x = sc.nextInt();
        search(arr,x);
    }
    //Linear Search
    public static int search(int arr[], int x) {
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==x) {
                System.out.println("Target Found");
                return i;
            }
        }
        System.out.println("Target Not Found");
        return -1;
    }
}
