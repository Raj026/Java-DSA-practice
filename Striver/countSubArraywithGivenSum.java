package Striver;

public class countSubArraywithGivenSum {
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        int n = arr.length;
        int k = 3, cnt = 0;
        for(int i = 0;i<n;i++) {
            int sum = arr[i];
            if(sum == k){
                cnt++;
                sum=0;
            }
            else{
                for(int j = i+1; j<n;j++) {
                    sum += arr[j];
                    if(sum == k) {
                        cnt++;
                        sum = 0;
                        break;
                    }
                    else if(sum > k) {
                        break;
                    }
                }
                sum = 0;
            }
        }
        System.out.println(cnt);
    }
}
