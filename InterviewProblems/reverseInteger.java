package InterviewProblems;

public class reverseInteger {
    public static void main(String[] args) {
        int a = 123;
        int result = 0;

        while(a!=0){
            int digit = a%10;
            result = result * 10 + digit;
            a /= 10;

        }

        System.out.println(result);
    }
}
