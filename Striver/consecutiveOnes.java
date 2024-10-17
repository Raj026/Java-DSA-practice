package Striver;

public class consecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,2,0,1,1,6,1,1,1};
        int max = 0, new_max = 0;

        for(int i:arr) {
            if(i==1) {
                new_max += 1;
                max = Math.max(max, new_max);
            }
            else{
                new_max = 0;
            }
        }
        System.out.println(max);
    }
}
