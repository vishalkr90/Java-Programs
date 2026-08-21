public class AddDigits {
    public static void main(String[] args) {
        int sum = 0;
        int n = 38;
        int rsum = n;
        while(rsum > 10){
            n = rsum;
            sum = 0;
            while(n>0){
            int digit = n%10;
            sum = digit + sum;
            n = n/10;
            rsum = sum;
            }
        }
        System.out.println(rsum);
    }
}
