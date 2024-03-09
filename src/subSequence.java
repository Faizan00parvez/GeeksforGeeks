public class subSequence {
    public static boolean isSubSequence(String s1, String s2) {
        int n=s1.length(),m=s2.length();
        int i=0, j=0;
        while(i<n && j<m) {
            if(s1.charAt(i) ==s1.charAt(j)) {
                i++;
            }
            j++;
        }
        return i==n;
    }
    public static void main(String[] args) {
        String s1 = "AXY", s2 = "ADXCPY";
        if(isSubSequence(s1,s2)) {
            System.out.print(" YEs it is a subsequence ");
        }
        else {
            System.out.print(" No, it is not a subsequence ");
        }
    }
}
