public class slidingWindow {
    public static void main(String[] args) {
        int[] arr = {-1, 2, 3, 3, 4, 5, -1};
        int n = arr.length;
        System.out.println(n);
        int k = 4;
        int r = k-1,l=0;
        int sum = 7;
        while(r < n) {

            sum -= arr[l];
            l++;
            r++;
            sum += arr[r];
            System.out.println(sum);
        }
    }
}
