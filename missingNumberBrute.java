public class missingNumberBrute {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int n = 5;
        int missing = -1;
        for(int i=1;i<=n;i++){
            int flag = 0;
            for(int j=0;j<n-1;j++){
                if(arr[j]==i){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                missing = i;
            }
        }
        System.out.println(missing);
    }
}
