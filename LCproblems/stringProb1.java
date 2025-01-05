package LCproblems;

public class stringProb1 {

    //LC 1768
    public static void main(String[] args) {
        String word1 = "abcde", word2 = "pqr";
        String res = "";
        int n1 = word1.length(), n2 = word2.length();

        int i = 0, j = 0;

        while(i<n1 && j<n2){
            res += word1.charAt(i);
            res += word2.charAt(j);

            i++;
            j++;
        }

        while(i<n1){
            res += word1.charAt(i);
            i++;
        }

        while(j<n2){
            res += word2.charAt(j);
            j++;
        }

        System.out.println(res);
    }
}
