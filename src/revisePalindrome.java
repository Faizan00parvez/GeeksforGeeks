import java.util.Scanner;

public class revisePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        int start = 0;
        int end = a.length()-1;

        boolean pal = true;

        while(start<end) {
            if(a.charAt(start) != a.charAt(end)) {
                pal = false;
                break;
            }
            start++;
            end--;
        }

        if(pal==true) {
            System.out.print("YES the string is palidnrome");
        } else{
            System.out.print("No the string is not palindorme");
        }


    }
}
