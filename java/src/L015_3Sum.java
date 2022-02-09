import java.util.*;

public class L015_3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int k = 0; k < nums.length - 2; k++){
            if(nums[k] > 0) break;
            if(k > 0 && nums[k] == nums[k - 1]) continue;
            int i = k + 1, j = nums.length - 1;
            while(i < j){
                int sum = nums[k] + nums[i] + nums[j];
                if(sum < 0){
                    while(i < j && nums[i] == nums[++i]);
                } else if (sum > 0) {
                    while(i < j && nums[j] == nums[--j]);
                } else {
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[k], nums[i], nums[j])));
                    while(i < j && nums[i] == nums[++i]);
                    while(i < j && nums[j] == nums[--j]);
                }
            }
        }
        return res;
    }

//    作者：jyd
//    链接：https://leetcode-cn.com/problems/two-sum/solution/3sumpai-xu-shuang-zhi-zhen-yi-dong-by-jyd/
//    来源：力扣（LeetCode）
//    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    public static void main(String[] args){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        L015_3Sum a = new L015_3Sum();
        System.out.println("[ ");
        for (List<Integer> line:a.threeSum(nums)){
            System.out.print("[ ");
            for(int x : line){
                System.out.print(x + " ");

            }
            System.out.println("],");
        }
        System.out.println("] ");
    }
}
