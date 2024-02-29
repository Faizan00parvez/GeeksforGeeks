class test05 {
    int x=10,y=15;
}

public class nonPrimitiveFunction {
    public static void main(String[] args) {
        test05 t = new test05();
        t.x = 5;
        t.y=12;
        sum(t);
        System.out.println(t.x + " " + t.y);
    }
    public static int sum(test05 t) {
        t.x = 7;
        t.y=14;
        return 0;
    }
}
