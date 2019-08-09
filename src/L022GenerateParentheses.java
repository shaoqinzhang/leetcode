import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class L022GenerateParentheses {
    public List<String> generateParenthesis2(int n) {
        LinkedList<LinkedList<String>> result = new LinkedList<LinkedList<String>>();
        LinkedList<String> list0 = new LinkedList<String>();
        list0.add("");
        result.add(list0);
        if (n == 0)
            return result.get(0);
        LinkedList<String> list1 = new LinkedList<String>();
        list1.add("()");
        result.add(list1);
        for (int i = 2; i <= n; i++) {
            LinkedList<String> temp = new LinkedList<String>();
            for (int j = 0; j < i; j++) {
                List<String> str1 = result.get(j);
                List<String> str2 = result.get(i - 1 - j);
                for (String s1 : str1) {
                    for (String s2 : str2) {
                        String el = "(" + s1 + ")" + s2;
                        temp.add(el);
                    }
                }

            }
            result.add(temp);
        }
        return result.get(n);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList();
        backtrack(ans, "", 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, String cur, int open, int close, int max){
        if (cur.length() == max * 2) {
            ans.add(cur);
            return;
        }

        if (open < max)
            backtrack(ans, cur+"(", open+1, close, max);
        if (close < open)
            backtrack(ans, cur+")", open, close+1, max);
    }

//    作者：LeetCode
//    链接：https://leetcode-cn.com/problems/two-sum/solution/gua-hao-sheng-cheng-by-leetcode/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

    public static void main(String[] args){
        int n=3;
        L022GenerateParentheses a = new L022GenerateParentheses();
        System.out.println(a.generateParenthesis(n));

    }
}
