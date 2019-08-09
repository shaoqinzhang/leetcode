public class L034FindFirstandLastPositionofElementinSortedArray {
    // returns leftmost (or rightmost) index at which `target` should be
    // inserted in sorted array `nums` via binary search.
    private int extremeInsertionIndex(int[] nums, int target, boolean left) {
        int lo = 0;
        int hi = nums.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] > target || (left && target == nums[mid])) {
                hi = mid;
            }
            else {
                lo = mid+1;
            }
        }

        return lo;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] targetRange = {-1, -1};

        int leftIdx = extremeInsertionIndex(nums, target, true);

        // assert that `leftIdx` is within the array bounds and that `target`
        // is actually in `nums`.
        if (leftIdx == nums.length || nums[leftIdx] != target) {
            return targetRange;
        }

        targetRange[0] = leftIdx;
        targetRange[1] = extremeInsertionIndex(nums, target, false)-1;

        return targetRange;
    }

//    ���ߣ�LeetCode
//    ���ӣ�https://leetcode-cn.com/problems/two-sum/solution/zai-pai-xu-shu-zu-zhong-cha-zhao-yuan-su-de-di-yi-/
//    ��Դ�����ۣ�LeetCode��
//    ����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������

    public int[] binarysearch(int[] nums,int taget){
        int mid;
        int l=0,h= nums.length-1;
        int first = l,second = h;
        int[] result = new int[3];
        while (l<=h){
            mid = (l+h)/2;
            if(nums[mid]==taget) {
                result[0] =mid;
                result[1] =first;
                result[2] =second;
                return result;
            }
            if(nums[mid]<taget) {
                first = mid+1;
                l = mid + 1;
            }
            else {
                second = mid-1;
                h = mid - 1;
            }
        }
        result[0]=-1;

        return result;

    }
    public int[] mysearchRange(int[] nums, int target) {
        int[] result = binarysearch(nums,target);
        int[] m = {-1,-1};
        if (result[0]==-1){
            return m;
        }
        while(nums[result[1]]<nums[result[0]]){
            result[1]++;
        }
        while(nums[result[2]]>nums[result[0]]){
            result[2]--;
        }
        m[0] = result[1];
        m[1] = result[2];
        return m;


    }
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        int target = 6;
        L034FindFirstandLastPositionofElementinSortedArray a =new L034FindFirstandLastPositionofElementinSortedArray();
        for(int x:a.searchRange(nums,target)){
            System.out.println(x);
        }
    }
}
