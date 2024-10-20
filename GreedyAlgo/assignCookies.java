package GreedyAlgo;

import java.util.Arrays;

public class assignCookies {
    public static void main(String[] args) {
        int[] greed = {1,2};
        int[] cookies = {1,2,3};
        Arrays.sort(greed);
        Arrays.sort(cookies);
        int m = greed.length;
        int n = cookies.length;

        int l = 0, r = 0;

        //this will generate two pointers and compare them
        //if the cookie will make the child content move to next child
        //otherwise l++ is going to move to next cookie everytime.
        while(l<n && r<m){
            if(cookies[l] >= greed[r]){
                r++;
            }

            l++;
        }

        System.out.println(r);
    }
}
