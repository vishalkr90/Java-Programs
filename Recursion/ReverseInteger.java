public class ReverseInteger {
    public static int reverse(int n,int r){
        if(n==0){
            return r;
        }
        return reverse(n/10,n%10 + r*10);
    }
    public static void main(String[] args) {
        System.out.println((reverse(2345,0)));
    }
}
