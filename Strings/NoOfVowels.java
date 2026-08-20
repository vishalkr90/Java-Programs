public class NoOfVowels {
    public static void main(String[] args) {
        String s = "sdfghjklwertyuiozxcvbnm";
        int n = s.length();
        int count = 0;
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.println("No of Vowels is : "+count);
    }
}
