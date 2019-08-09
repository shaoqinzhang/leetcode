public class L033SearchinRotatedSortedArray {
    public int search(int[] nums, int target){
        int n = nums.length;
        if(n==0){
            return -1;
        }
        if(n==1){
            return nums[0]==target? 0:-1;
        }
        int pivot = find_rotate_index(nums,0,n-1);
        // if target is the smallest element
        if (nums[pivot] == target)
            return pivot;
        // if array is not rotated, search in the entire array
        if (pivot== 0)
            return Bsearch(nums,0, n - 1,target);
        if (target < nums[0])
            // search in the right side
            return Bsearch(nums,pivot, n - 1,target);
        // search in the left side
        return Bsearch(nums,0, pivot,target);

    }
    public int Bsearch(int[] nums,int l, int h, int taget){
        int mid;
        while (l<=h){
            mid = (l+h)/2;
            if(nums[mid]==taget)
                return mid;
            if(nums[mid]<taget)
                l = mid+1;
            else
                h=mid-1;
        }
        return -1;

    }
    public int find_rotate_index(int[] nums,int left, int right) {
        if (nums[left] < nums[right])
            return 0;
        while (left <= right) {
            int pivot = (left + right) / 2;
            if (nums[pivot] > nums[pivot + 1])
                return pivot + 1;
            else {
                if (nums[pivot] < nums[left])
                    right = pivot - 1;
                else
                    left = pivot + 1;
            }
        }
        return 0;

    }
    public static void main(String[] args){
        int[] num = {4,5,0,0,0,0,1,2};
        int target = 0;
        L033SearchinRotatedSortedArray a = new L033SearchinRotatedSortedArray();
        System.out.println(a.search(num,target));
    }
}
