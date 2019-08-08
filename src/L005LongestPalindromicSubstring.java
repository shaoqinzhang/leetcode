public class L005LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

//    作者：LeetCode
//    链接：https://leetcode-cn.com/problems/two-sum/solution/zui-chang-hui-wen-zi-chuan-by-leetcode/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。


    public static String mylongestPalindrome(String s) {
//    overtime
        int n = s.length();
        int l=0,h=0;
        int i=0,j=n-1,max=0;
        while (i< n-max ){
            if(s.charAt(i)==s.charAt(j)){
                if(max<j-i+1&&isPalindrome(s,i,j)){
                        max = j-i+1;
                        l = i;
                        h = j;
                        i++;
                        j=n-1;
                }
                else {
                    j--;
                    if(j < i){
                        i++;
                        j = n-1;
                    }
                }
            }
            else {
                j--;
                if(j < i){
                    i++;
                    j = n-1;
                }
            }
        }
        if(max>0){
            return (s.substring(l,h+1));
        }
        else return "";

    }
    public static boolean isPalindrome(String s,int i, int j){
        while (s.charAt(i)==s.charAt(j)&&i<j){
            i++;
            j--;
        }
        if(i>=j)
            return true;
        else
            return false;

    }

    public String preProcess(String s) {
        int n = s.length();
        if (n == 0) {
            return "^$";
        }
        String ret = "^";
        for (int i = 0; i < n; i++)
            ret += "#" + s.charAt(i);
        ret += "#$";
        return ret;
    }

    // 马拉车算法
    public String longestPalindrome2(String s) {
        String T = preProcess(s);
        int n = T.length();
        int[] P = new int[n];
        int C = 0, R = 0;
        for (int i = 1; i < n - 1; i++) {
            int i_mirror = 2 * C - i;
            if (R > i) {
                P[i] = Math.min(R - i, P[i_mirror]);// 防止超出 R
            } else {
                P[i] = 0;// 等于 R 的情况
            }

            // 碰到之前讲的三种情况时候，需要利用中心扩展法
            while (T.charAt(i + 1 + P[i]) == T.charAt(i - 1 - P[i])) {
                P[i]++;
            }

            // 判断是否需要更新 R
            if (i + P[i] > R) {
                C = i;
                R = i + P[i];
            }

        }

        // 找出 P 的最大值
        int maxLen = 0;
        int centerIndex = 0;
        for (int i = 1; i < n - 1; i++) {
            if (P[i] > maxLen) {
                maxLen = P[i];
                centerIndex = i;
            }
        }
        int start = (centerIndex - maxLen) / 2; //最开始讲的求原字符串下标
        return s.substring(start, start + maxLen);
    }

//    作者：windliang
//    链接：https://leetcode-cn.com/problems/two-sum/solution/xiang-xi-tong-su-de-si-lu-fen-xi-duo-jie-fa-bao-gu/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    public static void main(String[] args) {
        L005LongestPalindromicSubstring a=new L005LongestPalindromicSubstring();
        String case1 = "babad";
        String case2 = "bab";
        String case3 = "cbbd";
        System.out.println(a.longestPalindrome(case1));
        System.out.println(a.longestPalindrome(case2));
        System.out.println(a.longestPalindrome(case3));
    }
}
