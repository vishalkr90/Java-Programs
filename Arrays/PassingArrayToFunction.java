public class PassingArrayToFunction {
    public static void main(String[] args) {
        int[] x = {43,44,55,33,77};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] y){
        y[2] = 99;
    }
}
