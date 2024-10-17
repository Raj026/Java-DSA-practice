public class leaderInArray {
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
//BRUTE
//        for(int i=0;i<arr.length;i++){
//            boolean leader = true;
//            for(int j=i+1;j<arr.length;j++){
//                if(arr[j]>arr[i]){
//                    leader = false;
//                    break;
//                }
//            }
//            if(leader){
//                System.out.println(arr[i]);
//            }
//        }
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-1;i>=0;i--){
            boolean leader = true;
            if(max<arr[i]){
                max = arr[i];
                System.out.println(arr[i]);
            }
        }
    }
}
