public class FirstAndLastOccurence{
    public static void main(String[] args) {
        int arr[] = {1,1,3,4,4,4,5,5,5,6,7,7};
        int target = 5;
        int n = arr.length;
        // First Occurrence
        int low = 0;
        int high = n - 1;
        int first = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;    // Left side search
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Last Occurrence
        low = 0;
        high = n - 1;
        int last = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;     // Right side search
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("First Occurrence = " + first);
        System.out.println("Last Occurrence = " + last);
    }
}