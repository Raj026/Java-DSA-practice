package Strings;

import java.util.Arrays;

public class panagramString {
    public static void main(String[] args) {
        String st = "thequickbrownfojumpsoverthelazydog";
        int[] arr = new int[26];
        int count = 0;

        for(char k:st.toCharArray()){
            int a = k - 'a';
            if(arr[a] == 0) {
                arr[a]++;
                count++;
            }
            else {
                arr[a]++;
            }
//            arr[a] = 1;
//            System.out.println(a);
        }

//        for(int p:arr) {
//            if(p==0) {
//                System.out.println("Not a Panagram");
//            }
//        }
        if(count==26){
            System.out.println("Panagram");
        }
        else {
            System.out.println("no panagram");
        }


        System.out.println(Arrays.toString(arr));
    }
}
