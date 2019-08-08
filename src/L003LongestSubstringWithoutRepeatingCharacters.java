import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class L003LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;

//        作者：LeetCode
//        链接：https://leetcode-cn.com/problems/two-sum/solution/wu-zhong-fu-zi-fu-de-zui-chang-zi-chuan-by-leetcod/
//        来源：力扣（LeetCode）
//        著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

    }
    public static int mylengthOfLongestSubstring(String s) {
        int i,j, n = s.length();
        if (n==0){
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int count = 0,maxcount = 0;
        for (i = 0;i < n;i++){
                if (set.contains(s.charAt(i))) {
                    if (maxcount < count)
                        maxcount = count;
                    set.clear();
                    count = 0;
                    for (j= i-1;j>=0;j--){
                        if(s.charAt(i)==s.charAt(j)){
                            i=j;
                            break;
                        }
                    }
                } else {
                    set.add(s.charAt(i));
                    count++;
                }

        }
        if(maxcount < count)
            maxcount = count;
        return maxcount;
    }
    public static void main(String[] args){
        String case1 = "abcabcbb";
        String case2 = "bbbbb";
        String case3 = "dvdf";
        System.out.println(lengthOfLongestSubstring(case1));
        System.out.println(lengthOfLongestSubstring(case2));
        System.out.println(lengthOfLongestSubstring(case3));

    }
}
