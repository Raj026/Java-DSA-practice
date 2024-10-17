public class minAverage {
    public static void main(String[] args) {
        int[] arr = {2,5,3,9,5,3};

        int sum = 0;
        for(int k:arr) {
            sum += k;
        }
//        System.out.println(sum);
        int ls = 0;
        int rs = 0;
        int min_avg;
        for(int i=0;i<arr.length;i++) {
            ls += arr[i];
//            System.out.println(ls);
            rs = sum - ls;
            int left_avg, right_avg;
            if(i!=arr.length-1) {
                left_avg = ls / (i+1);

                right_avg = rs / (arr.length-(i+1));
                System.out.println(left_avg + " " + right_avg + " " + i + " " + (arr.length - i));
            }
            else {
                left_avg = ls / (i+1);
                right_avg = 0;
            }


        }
    }
}
