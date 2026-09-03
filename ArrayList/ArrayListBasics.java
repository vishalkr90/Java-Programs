import java.util.ArrayList;
public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(35);
        arr.add(53);
        arr.add(95);
        arr.add(3);
        arr.add(33);
        arr.add(73);
        System.out.println(arr.get(4));
        arr.set(4,87);
        System.out.println(arr.get(4));
        System.out.println(arr);
        // for(int i = 0;i<arr.length;i++){
        //     System.out.print(arr.get(i)+" ");
        // }
    }
}
