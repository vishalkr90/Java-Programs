public class MethodOverloading {
    public static int sum(int a , int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static String sum(String x,String y){
        return x+y;
    }

    public static void main(String[] args) {
        int add =  sum(8,3);
        System.out.println(add);
        int addd =  sum(8,3,3);
        System.out.println(addd);
        String aad = sum("Vishal","Kumar");
        System.out.println(aad);
    }

}
