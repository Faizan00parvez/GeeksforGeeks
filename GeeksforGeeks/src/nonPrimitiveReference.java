public class nonPrimitiveReference {
    int x, y;
}
class Test02 {
    public static void main(String[] args) {
        nonPrimitiveReference npr = new nonPrimitiveReference();
        npr.x = 30;
        npr.y = 50;
        nonPrimitiveReference npr2 = npr;
        npr2.x = 7;
        System.out.println(npr.x + " " + npr2.x);
    }
}
