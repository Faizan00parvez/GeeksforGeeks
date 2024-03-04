import java.util.Scanner;

public class primeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeF(n);
    }
    public static int primeF(int n) {
        for(int i=2;i<n;i++) {
            if(isPrime(i)) {
                int x=i;
                while(n%x==0) {
                    System.out.print(i + " ");
                    x=x*i;
                }
            }

        }
        return 0;
    }
    public static boolean isPrime(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0) {
                return false;
            }

        }
        return true;
    }
}
