import java.util.Scanner;
public class ArraySearching {
    public static void main(String[] args) {
        int [] arr = {3, 4, 5, 6, 34, 45, 24, 243, 64, 12};
        System.out.println("Welcome to array seaching");
        System.out.print("Enter the number that you want to search: ");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        for(int index = 0;index <= arr[10];index++){
            if(num == arr[index]){
                System.out.println(arr[index]);
            }
        }
    }
}
