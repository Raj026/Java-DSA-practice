public class secondLargestOptimal {
    public static void main(String[] args) {
        int[] arr = {4,5,8,1,2,6,9};

        int largest = arr[0];

        for(int i=1;i<arr.length;i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }

        int secondL = -1;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > secondL && arr[i] != largest){
                secondL = arr[i];
            }
        }
        System.out.println(secondL);

    }
}
