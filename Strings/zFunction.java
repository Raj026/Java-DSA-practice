package Strings;

public class zFunction {
    public static void main(String[] args) {
        String m = "needle";
        String t = "haystackneedleontop";

        int k = 1;
        int len = m.length();
        int res = 0;
        int occ = -1;
        for(int i=0;i<t.length();i++) {
            if(t.charAt(i) == m.charAt(0)){
                int j = i+1;
                while(k < len) {
                    if(t.charAt(j) == m.charAt(k)) {
                        j++;
                        k++;

                    }
                    if (k==len-1){
                        occ = i;
                    }
                    else{
                        break;
                    }
                }


            }
        }
        System.out.println(occ);
    }
}
