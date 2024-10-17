package Striver;

public class pascalTriangleOptimal {
    public static void main(String[] args) {
        int rows = 5;

        for(int c =1;c<=rows;c++) {
            System.out.print(factorialNCR(rows-1, c-1) + " ");
        }
        System.out.println();

    }

    public static int factorialNCR(int n, int r){
        int res = 1;

        for(int i=0;i<r;i++) {
            res = res * (n-i);
            res = res / (i+1);
        }
//        if(n==1 || n==0) {
//            return 1;
//        }
//
//        return n * factorial(n-1);
        return res;
    }
}
