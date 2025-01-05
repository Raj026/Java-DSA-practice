package InterviewProblems;

public class defangedIP {
    public static void main(String[] args) {
        String IP = "1.1.1.1";
        String res = "";
        String defanged = "[.]";
        for(char k: IP.toCharArray()){
            if(k=='.'){
                res += defanged;
            }
            else {
                res += k;
            }
        }

        System.out.println(res);
    }
}
