package InterviewProblems;

public class containerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int n = arr.length;

        int a = 0, b = n-1;
        int max_area = Integer.MIN_VALUE;
        while(a<b){
            if(arr[a] > arr[b]){
                max_area = Math.max(max_area , arr[b] * (b-a));
                b--;
            }
            else {
                max_area = Math.max(max_area, arr[a] * (b-a));
                a++;
            }
        }
        System.out.println(max_area);
    }
}
