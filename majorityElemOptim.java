public class majorityElemOptim {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 5, 6, 2, 3, 3, 2, 2,2};

//        Moore's' Algo
        int n = arr.length;
        int count = 0;
        int el = 0;
        for(int i=0;i<n;i++){
            if(count==0){
                el = arr[i];
                count = 1;
            } else if (arr[i] == el) {
                count++;

            }
            else{
                count--;
            }
//            System.out.println(count);
        }
        int ct1 = 0;
        for(int i:arr){
            if(i==el){
                ct1++;
            }
        }
        if(ct1 > (n/2)){
            System.out.println(el);
        }
    }
}
