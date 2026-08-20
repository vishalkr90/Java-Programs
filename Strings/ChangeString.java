public class ChangeString {
    public static void main(String[] args) {
        String s = "Abcd";
        char first = s.charAt(0);
        if(Character.isLowerCase(first)){
            System.out.println(s.toLowerCase());
        }
        else{
            System.out.println(s.toUpperCase());
        }
    }
}
