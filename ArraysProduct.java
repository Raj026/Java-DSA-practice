import java.util.Date;

public class ArraysProduct {
    public static void main(String[] args) {
//        int[] arr = {1,5,6,3};
//
//        int [] a = new int[3];
//        int count = 0;
//        int prod = 0;
//        for(int i=0;i<arr.length;i++) {
//
//        }
//        Date currentDate = new Date();
//        Date expire = new Date(currentDate.getTime() + 604800000);
//        System.out.println(currentDate.getTime());
//        System.out.println(expire);
        int[] arr = {2,7,11,15};

        int target = 18;

        int i = 0,j= arr.length-1;
        while(i<j) {
            int sum = arr[i] + arr[j];
            if(target > sum) {
                i++;
            } else if (target < sum) {
                j--;
            }
            else{
                break;
            }
        }


        System.out.println(i+ " "+ j);
    }
}
