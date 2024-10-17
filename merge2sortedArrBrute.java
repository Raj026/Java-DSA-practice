import java.util.Arrays;

public class merge2sortedArrBrute {
    public static void main(String[] args) {
        int[] a = {1,2,2,3,6,9};
        int[] b = {4,5,7,7,10,13};
        int m = a.length;
        int n = b.length;
        int i = 0;
        int j = 0;

        int[] c = new int[m+n];
        int k =0;
        while(i<m && j<n){
            if(a[i] <= b[j]){
                c[k++] = a[i];
                i++;
            }
            else{
                c[k++] =b[j];
                j++;
            }
        }
        while(i<m){
            c[k++] = a[i];
            i++;
        }
        while(j<n){
            c[k++] = b[j];
            j++;
        }

        System.out.println(i);
        System.out.println("J: "+j);
        System.out.println(Arrays.toString(c));
    }
}
