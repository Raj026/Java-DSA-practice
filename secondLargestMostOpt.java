public class secondLargestMostOpt {
    public static void main(String[] args) {
        int[] arr = {4,2,3,4,1,10,7,9,11};

        int largest = arr[0];
        int secondL = -1;

        for(int i=1;i<arr.length;i++){
            if(arr[i] > largest){
                secondL = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondL){
                secondL = arr[i];
            }
        }
        System.out.println(secondL);
    }
}
