public class functionOnString {
    public static void main(String[] args) {
        /*String s1 = "geeksforgeeks";
        String s2 = "geeks";
        System.out.println(s1.contains(s2));
         */
        /*String s1 = "geeksForgeeks";
        String s2 = "geeksforgeeks";

        System.out.println(s1.equals(s2));

         */

        String s1 = "ABeksforgeeks";
        String s2 = "Bor";

        int res = s1.compareTo(s2);

        if(res == 0) {
            System.out.println("same");
        }
        if(res >0) {
            System.out.println("s1 Greater");
        }
        if(res<0) {
            System.out.println("s1 Smaller");
        }


    }
}
