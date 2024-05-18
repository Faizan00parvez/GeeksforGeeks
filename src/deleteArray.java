import java.util.Scanner;

public class deleteArray {
    public static void main(String[] args) {
        int []arr = {2,6,81,45,15,74};
        System.out.println("Here is the required array");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        delete(arr,x);
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int delete(int arr[], int x) {
        int i;
        for(i=0;i<arr.length;i++) {
            if(arr[i]==x) {
                break;
            }

        }
        if(i==arr.length) {
            return arr.length;
        }
        for(int j=i; j<arr.length-1; j++) {
            arr[j] = arr[j+1];
        }
        return (arr.length-1);
    }
}
