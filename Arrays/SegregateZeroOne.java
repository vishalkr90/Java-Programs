public class SegregateZeroOne {
    public static void main(String[] args) {
        int arr[] = {0 ,1 ,0 ,1 ,0, 0 ,1 ,1 ,1, 0,0};
        int n = arr.length;
        // int nz = 0;
        // int no = 0;
        // for(int ele : arr){
        //     if(ele == 0){
        //         nz++;
        //     }
        //     else{
        //         no++;
        //     }
        // }
        // // for(int i = 0;i<n;i++){
        // //     if(arr[i]==0){
        // //         nz++;
        // //     }
        // //     else{
        // //         no++;
        // //     }
        // // }
        // System.out.println("Zeros : "+nz);
        // System.out.println("Ones : " +no);
        // for(int i = 0;i<nz;i++){
           
        //         arr[i] = 0;
           
        // }
        // for(int i = nz;i<n;i++){
            
        //         arr[i] = 1;
            
        // }
        

        //Two Pointers

        int i = 0;
        int j = n-1;
        while(i<j){
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
            if(arr[i] == 1 && arr[0] == 0){
                arr[i] = 0;
                arr[j] = 1;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
