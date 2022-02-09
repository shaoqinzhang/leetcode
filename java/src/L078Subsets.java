import java.util.ArrayList;
import java.util.List;

public class L078Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int size = nums.length;
        for (int i = 0; i < (1 << size); i++) {
            List<Integer> ax = new ArrayList<>();
            for (int j = 0; j < size; j++) {
                if ((i & (1 << j)) != 0) {
                    ax.add(nums[j]);
                }
            }
            list.add(ax);
        }
        return list;
    }
//    作者：yi-qu-xin-ci
//    链接：https://leetcode-cn.com/problems/two-sum/solution/wei-yun-suan-by-yi-qu-xin-ci/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

    public static void main(String[] args) {
        int[] nums ={1,2,3};
        L078Subsets solution = new L078Subsets();
        for (List<Integer> line : solution.subsets(nums)) {
            for (int x : line) {
                System.out.print(x + ", ");
            }
            System.out.println();
        }
    }
}
