import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class countDuplicatesbrute {
    public static void main(String[] args) {
        int[] arr = {7,8,9,4,8,6,7,11,8};
        System.out.println(arr.length);

        Set <Integer> res = new HashSet<>();

        for(int i:arr){
            if(res.contains(i)){
                continue;
            }
            else{
                res.add(i);
            }
        }

        int index = 0;
        int[] ans = new int[res.size()];
        for(int j:res){
//            System.out.println(j);
            ans[index] = j;
            index++;
        }
        System.out.println(Arrays.toString(ans));
        System.out.println(res.size());
    }
}
