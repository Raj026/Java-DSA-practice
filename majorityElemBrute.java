public class majorityElemBrute {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 5, 6, 2, 3, 3, 2, 2};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
//            System.out.println(count + " "+ arr[i]);
            if (count >= (n / 2) + 1) {
                System.out.println(arr[i]);
                break;
            }
        }

    }
}
