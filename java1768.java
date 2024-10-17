public class java1768 {
    //Leetcode 1768
    public static void main(String[] args) {
        String res = "zaz";
        char[] c = res.toCharArray();
        int sum = 0;
        for(int i=1;i<c.length;i++) {
            int adj = (int) c[i], adj1 = (int) c[i-1];
            sum += Math.abs(adj - adj1);

        }

        System.out.println(sum);
    }
}
