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

//    ���ߣ�LeetCode
//    ���ӣ�https://leetcode-cn.com/problems/two-sum/solution/bu-tong-de-er-cha-sou-suo-shu-by-leetcode/
//    ��Դ�����ۣ�LeetCode��
//    ����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������
    public static void main(String[] args){
        int n=3;
        L096UniqueBinarySearchTrees solution = new L096UniqueBinarySearchTrees();
        System.out.println(solution.numTrees(n));

    }
}
