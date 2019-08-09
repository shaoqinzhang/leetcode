import java.util.Arrays;

public class L031NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if (n<2){
            return;
        }
        int i,j;
        i=n-2;
        while(i>=0&&nums[i]>=nums[i+1]){
            i--;
        }
        j=n-1;
        while (i>=0&&j>=0&&nums[j]<=nums[i]) {
            j--;
        }
        if(i>=0){
            swap(nums,i,j);
        }
        reverse(nums,i+1,n);
        for (int x:nums){
            System.out.println(x);
        }
    }
    public void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void reverse(int[] nums,int i,int n){
        int j=n-1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        int[] num = {1,1};
        L031NextPermutation a = new L031NextPermutation();
        a.nextPermutation(num);
    }
}
