package Strings;

public class palindromeString {
    public static void main(String[] args) {
        String st = "racecar";
        int low = 0, high = st.length()-1;
        boolean flag = true;
        while(low<=high){
            if(st.charAt(low) != st.charAt(high)){
                flag = false;
            }
            low++;
            high--;
        }

        if(flag) System.out.println("Palindrome");
    }
}
