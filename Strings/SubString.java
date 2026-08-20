public class SubString {
    public static void main(String[] args) {
        String s = "Vishal";
        int n = s.length();
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n+1;j++){
                System.out.print(s.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
