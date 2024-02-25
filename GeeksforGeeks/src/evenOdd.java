import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number = ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n%2==0) {
            System.out.println(" The number is Even ");
        }
        else {
            System.out.println(" The number is Odd ");
        }
    }
}
