public class containerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        int a = 0;
        int b = arr.length - 1;
        int max = 0;

        while(a<b) {
            if(arr[a] < arr[b]){
                max = Math.max(max, arr[a] * (b-a));
                a++;
            }
            else{
                max = Math.max(max, arr[b] * (b-a));
                b--;
            }
        }
        System.out.println(max);
//        int i = 0;
//        int j = arr.length - 1;
//        int width;
//        int height, max_area = 0 , area;
//
//        while(i<j){
//            width = j-i;
//            height = Math.min(arr[i], arr[j]);
//            area = width * height;
//            max_area = Math.max(max_area, area) ;
//            if(arr[i] > arr[j]) {
//                j--;
//            }
//            else {
//                i++;
//            }
//            System.out.println(max_area);
//        }

    }
}
