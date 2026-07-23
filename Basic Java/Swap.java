public class Swap {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("Before Swap: ");
        a = 6;
        b = 5;
        System.out.println("a = " + a + " and b = " + b);
        System.out.println("After Swap: ");
        c = a;
        a = b;
        b = c;
        System.out.println("a = " + a + " and b = " + b);
    }
}
