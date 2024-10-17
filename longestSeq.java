import java.util.HashSet;

public class longestSeq {
    public static void main(String[] args) {
        int[] arr = {102,4,100,101,1,3,2,1,1};

        HashSet<Integer> res = new HashSet<>();

        for(int i:arr){
            res.add(i);
        }
        int longest=1;
        for(int it:res){
            if(!res.contains(it-1)){
                int count = 1;
                int x = it;
                while(res.contains(x+1)){
                    x = x+1;
                    count++;
                }
                longest=Math.max(longest,count);

            }
        }

        System.out.println(longest);
    }
}
