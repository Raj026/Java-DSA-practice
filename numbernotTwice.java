import java.util.HashMap;
import java.util.Map;

public class numbernotTwice {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5,5};
        HashMap<Integer, Integer> res = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int val = arr[i];
            if(res.containsKey(val)){
                res.put(val, res.get(val) + 1);
            }


            else{
                res.put(val, 1);
            }

        }

        for(Map.Entry<Integer, Integer> it: res.entrySet()){
//            System.out.println("Key: "+ it.getKey() + "Value: " + it.getValue());
            if(it.getValue() == 1){
                System.out.println(it.getKey());
            }
        }




//        OPTIMAL
//        int maximum = 0;
//        for(int i: arr){
//            maximum = Math.max(i,maximum);
//        }
//        int[] hash = new int[maximum+1];
//
//        for(int i:arr){
//            hash[i]++;
//        }
//
//        for(int i=0;i< arr.length;i++){
//            if(hash[arr[i]] == 1){
//                System.out.println(arr[i]);
//            }
//        }

        //BRUTE FORCE
//        int num = 0;
//        int count = 0;
//        for(int i =0;i<arr.length;i++){
//            num = arr[i];
//            count = 0;
//            for(int j =0;j<arr.length;j++){
//                if(arr[j]==num){
//                    count++;
//                }
//            }
//            if(count==1){
//
//                System.out.println(num);
//                break;
//            }
//        }
    }
}
