package SlidingWindoAndTwoPointer;

public class binarySubArrayWithSum {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0};
        int goal = 0;
        int n = arr.length;

        int atmost = Helper(arr, goal);
        int atl = Helper(arr, goal - 1);
        System.out.println(atmost);
        System.out.println(atl);

//        int l = 0,r = 0, cnt = 0, sum = 0,cnt1 = 0;
//        while(r<n){
//            sum += arr[r];
//
//            while(sum > goal){
//                sum -= arr[l];
//                l++;
//            }
//            if(sum == goal) cnt += (r-l+1);;
//
//            r++;
//        }
//        while(l<n){
//            sum -= arr[l];
//            if(sum == goal){
//                cnt1++;
//            }
//            l++;
//        }

//        System.out.println(cnt);
     }

     public static int Helper(int[] a, int goal){
        if(goal < 0) return  0;
        int l= 0,sum = 0, cnt = 0;
        for(int i = 0;i<a.length;i++){
            sum += a[i];

            while(sum>goal){
                sum -= a[l];
                l++;
            }

            cnt += (i-l+1);
        }
        return cnt;
     }
}
