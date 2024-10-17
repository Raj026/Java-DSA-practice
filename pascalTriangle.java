public class pascalTriangle {
    public static void main(String[] args) {
        int row = 5;
//        int col = 3;
//        int elem = pascal(row, col);
        pascal(row);


    }

//    public static int pascal(int r, int c){
//        int el = nCr(r-1, c-1);
//        return el;
//    }

    public static void pascal(int n){
        for(int c=1;c<=n;c++){
            System.out.print(nCr(n-1, c-1) + " ");
        }
    }
    public static int nCr(int n, int r){
        int res = 1;
        for(int i =0;i<r;i++){
            res = res * (n-i);
            res = res / (i+1);
        }
        return res;
    }
}
