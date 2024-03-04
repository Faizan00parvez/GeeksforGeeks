import java.io.*;

public class stringPalindrome {
    public static boolean isPalindrome(String s1) {
        int i=0, j = s1.length()-1;

        while(i<j) {
            if(s1.charAt(i) != s1.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "faizan";

        s1 = s1.toLowerCase();

        if(isPalindrome(s1)) {
            System.out.print(" Yes ");
        }
        else{
            System.out.print(" No ");
        }
    }
}
