public class PalindromeString {
    public static void main(String[] args) {
        String s = "hello";
        int n = s.length();
        int i = 0,j = n-1;
        while(i<j){
            char ch = s.charAt(i);
            char re = s.charAt(j);
            if(ch==re){
                i++;
                j--;
            }
            else{
                System.out.println("It is not palindrome");
                return;
            }
        }
        System.out.println("It is palindrome");
    }
}
