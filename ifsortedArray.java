public class ifsortedArray {
    public static void main(String[] args) {
        int[] arr = {4,8,9,16,21,22};
        boolean res = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                res = false;
            }
        }

        if(res){
            System.out.println("Sorted");
        }
        else {
            System.out.println("Not Sorted");
        }
    }
}
