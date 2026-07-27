public class FindDuplicateElement {
    public static void main(String[] args) {
    int[] arr = {2,3,1,4,2};
    int n = arr.length;
    boolean[] flag = new boolean[n + 1];

    for (int i = 0; i < n; i++) {
    int ele = arr[i];

    if (flag[ele]) {
        System.out.println("Duplicate = " + ele);
    } 
    else {
        flag[ele] = true;
    }
}
    }
}
