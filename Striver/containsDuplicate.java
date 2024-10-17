package Striver;

import java.util.HashSet;
import java.util.Set;

public class containsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};

        Set<Integer> s = new HashSet<>();
        boolean b = false;
        int k = -1;

        for(int i:arr){
            if(s.contains(i)){
                k = i;
                b = true;
                break;
            }
            s.add(i);
        }

        if(b) {
            System.out.println("The repeating value is : "+ k);
        }
    }
}
