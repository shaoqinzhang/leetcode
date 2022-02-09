public class L055JumpGame {
    boolean res = false;
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n==1)
            return true;
        for(int i = Math.min(nums[0],n-1);i>0;i--){
            jump(nums,i,i);
        }
        return res;
    }
    public void jump(int[] nums,int i,int n) {
        if(n==nums.length-1){
            res = true;
        }
        else {
            for(int m = Math.min(nums[n],nums.length-n-1);m>0;m--){
                jump(nums,m,n+m);
            }
            return;
        }
    }
    public static void main(String[] args) {
        int[] case1 = {2,0};
        L055JumpGame solution = new L055JumpGame();
        System.out.println(solution.canJump(case1));

    }
}
