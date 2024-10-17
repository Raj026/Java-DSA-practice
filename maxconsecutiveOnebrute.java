public class maxconsecutiveOnebrute {
    public static void main(String[] args) {
        int[] arr = {2,1,1,3,1,1,1,9,8,7,1};
        int count = 0;
        int maxCount = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                if(count>maxCount){
                    maxCount = count;
                }
            }
            else{
                count = 0;
            }
        }
        System.out.println(maxCount);
    }
}
