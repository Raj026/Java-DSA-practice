import java.util.Arrays;

public class repeatingAndMissing {
    public static void main(String[] args) {
        int[] arr = {4,2,6,1,5,1};
        int[] res = new int[2];
        int hash[] = new int[arr.length+1];
        for(int i:arr) {
            hash[i]++;
        }

        for(int i=1;i< hash.length;i++) {
            if(hash[i]==2) res[0] = i;
            else if(hash[i]==0) res[1] = i;
        }
        System.out.println(Arrays.toString(hash));
        System.out.println(Arrays.toString(res));
//        int[] res = new int[2];
//        for(int i=1;i<=arr.length;i++) {
//            int count = 0;
//            for(int j=0;j<arr.length;j++) {
//                if(arr[j]==i) {
//                    count++;
//                }
//            }
//            if(count==2) {
//                res[0] = i;
//            }
//            else if(count==0) {
//                res[1] = i;
//            }
//        }
//        BRUTE FORCE
//
//        System.out.println(Arrays.toString(res));

    }
}
