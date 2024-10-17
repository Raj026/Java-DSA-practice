package Strings;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] st = {"flower", "flow", "flight"};

        String prefix = st[0];

        for(int i=1;i<st.length;i++) {
            while(st[i].indexOf(prefix) !=0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
    }
}
