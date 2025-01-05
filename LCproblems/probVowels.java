package LCproblems;

public class probVowels {
    public static void main(String[] args) {
        String s = "IceCreAm";
//        s = swap(s, 0,6 );
//        System.out.println(s);
        int k = s.length();

        int i = 0, j = k-1;

        while(i<j){
            while(i<j  && !isVowel(s.charAt(i))){
                i++;
            }
            while(i<j && !isVowel(s.charAt(j))){
                j--;
            }

            if(i<j){
                s = swap(s,i,j);
                i++;
                j--;
            }
        }

        System.out.println(s);
    }

    public static String swap(String m , int a, int b){
        char[] l = m.toCharArray();

        char temp = l[a];
        l[a] = l[b];
        l[b] = temp;
        return new String(l);
    }
    public static boolean isVowel(char k){
        if(k=='A' || k=='E' || k=='I' || k=='O' || k=='U' || k=='a' || k=='e' || k=='i' || k=='o' || k=='u'){
            return true;
        }
        return false;
    }
}
