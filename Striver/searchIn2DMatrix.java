package Striver;

public class searchIn2DMatrix {
    public static void main(String[] args) {
        int[][] arr ={
                {3,4,7,9},
                {12,13,16,18},
                {20,21,23,29}
        };

        int r = arr.length;
        int target = 23;
        int c = arr[0].length;
        int j = 1;

        for(int i = 0;i<r;i++){
            int start = arr[i][0];
            int end;
            boolean f = false;
            if(j==r){
                end = arr[j-1][0];
                f = true;
            }
            else{
                end = arr[j++][0];
            }

            if(end >= target && start <= target){
                for(int k = 0;k<c;k++){
                    if(arr[i][k] == target){
                        System.out.println(i + " " + j);
                        break;
                    }
                }
            } else if (f) {
                for(int k = 0;k<c;k++){
                    if(arr[i][k] == target){
                        System.out.println(i + " " + k);
                        break;
                    }
                }

            }


        }
    }
}
