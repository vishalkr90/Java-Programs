class Solution {
    public static double myPow(double x, int n) {
        if(n==0) return 1;
        double call = myPow(x,n/2);
       
        // if(n<0){
        //     return 1.0/(x*call*call);
        // }
        if(n%2==0) return call*call;
        else return x*call*call;
    }
    public static void main(String[] args) {
        double a = 2;
        int b = -2;
        double d = myPow(a,b);
        System.out.println(d);
    }
}