public class simplePattern {
    public static void main(String[] args) {
        int i=1;
        while(i<=5) {
            int j=1;
            while(j<5) {
                if(j==1 || j==4) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println(" * ");
            i++;
        }

    }
}
