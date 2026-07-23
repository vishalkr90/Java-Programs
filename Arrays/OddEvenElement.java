public class OddEvenElement {
    public static void main(String[] args) {
        int[] arr = {30,55,40,68,20};
        for(int i = 0;i<arr.length;i++){
            if(i%2==0){
                System.out.print((arr[i]+10)+" ");
            }
                else{
                    System.out.print((arr[i]*2)+" ");
                }
            
        }
    }
}
