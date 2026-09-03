public class GlobalVariable {
    static int x = 10;
    public static void fun(int x){
        x = 20;
    }
    public static void main(String[] args) {
        System.out.println(x);
        // fun(x);
        x = 99;
        System.out.println(x);
        int x = 4;
        System.out.println(x);
        x = 6;
        System.out.println(x);

    }
}
