public class L096UniqueBinarySearchTrees {
    public int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = 1;
        G[1] = 1;

        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }

//    作者：LeetCode
//    链接：https://leetcode-cn.com/problems/two-sum/solution/bu-tong-de-er-cha-sou-suo-shu-by-leetcode/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    public static void main(String[] args){
        int n=3;
        L096UniqueBinarySearchTrees solution = new L096UniqueBinarySearchTrees();
        System.out.println(solution.numTrees(n));

    }
}
