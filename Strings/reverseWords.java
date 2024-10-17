package Strings;

public class reverseWords {
    public static void main(String[] args) {
        String st = "osso racecar aracecara pls";
        String[] res = st.split(" ");
        int max_len = Integer.MIN_VALUE;
        for(String s: res ) {
            if(palindrome(s)){
                max_len = Math.max(max_len, s.length());
            }
        }

        System.out.println(max_len);

    }

    public static boolean palindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i<=j) {
            if(s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }
            else{
                return false;
            }
        }

        return true;
    }
}
