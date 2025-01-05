package Striver;

import java.util.ArrayList;

public class kthPositiveMissingInteger {
    public static void main(String[] args) {
        int[] arr = {4,7,9,10};
        int k = 1, j=0,i=1;
        ArrayList<Integer> res = new ArrayList<>();

        while(res.size()!=k){
            if(arr[j] == i){
                j++;
//                continue;
            }
            else {
                res.add(i);
            }
            i++;
        }
//        for(int i=1;i<40;i++){
//            if(res.size()==k){
//                res.get(res.size()-1);
//                break;
//            }
//            if(arr[j] == i){
//                j++;
////                continue;
//            }
//            else {
//                res.add(i);
//            }
//        }

        System.out.println(res.get(res.size()-1));


    }
}
