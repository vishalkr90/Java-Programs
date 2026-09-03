public class Diva {
    public static void main(String[] args) {
        int n = 99;
        int sum = 0;
        int num = n;
        while(n>0){
            int digit = n%10;
            sum = sum + digit;
            n = n/10;
        }
        n = num;
        int product = 1;
        while(n>0){
            int digit = n%10;
            product = product * digit;
            n = n/10;
        }
        int c = sum + product;
        System.out.println(sum + " " + product+" " + c);
    }
}
