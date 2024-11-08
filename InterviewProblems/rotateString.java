package InterviewProblems;

public class rotateString {
    public static void main(String[] args) {
        String s = "aa";
        String goal = "a";
        int k = -1;
        if(s.length() != goal.length()) System.out.println("False");
        s += s;
        System.out.println(s);

        System.out.println(s.contains(goal));
//        for(int i =0;i<goal.length();i++){
//            if(goal.charAt(i) == s.charAt(0)){
//                k = i-1;
//            }
//        }
//        String a = s.substring(k) + s.substring(0, k);
//
//        System.out.println(a.equals(goal));


    }
}
