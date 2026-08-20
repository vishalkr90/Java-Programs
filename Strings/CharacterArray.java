public class CharacterArray {
    public static void main(String[] args) {
        String s = "Vishal";
        System.out.println(s);
        s = "Monday";
        System.out.println(s);
        char[] arr = {'V', 'i', 's', 'h', 'a', 'l'};
        for(char ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        arr[0] = 'j';
        for(char ele : arr){
            System.out.print(ele+" ");
        }
    }
}
