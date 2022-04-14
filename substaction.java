public class substaction {
    public int sub(int x, int y) {
        return x - y;

    }

    public static void main(String[] args) {
        substaction s1 = new substaction();
        int a = s1.sub(10, 9);
        System.out.println(a);
    }
}
