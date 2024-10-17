package Striver;

public class pascalTriangle {
    public static void main(String[] args) {
        int row = 5;
        int col = 3;

        int res = factorial(5-1) / (factorial(3-1) * factorial(4-2));
        System.out.println(res);

    }

    public static int factorial(int n) {
        if(n==1){
            return 1;
        }

        return n * factorial(n-1);
    }
}
