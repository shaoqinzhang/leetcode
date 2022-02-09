public class L075SortColors {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int cur=0,p=0,q=len-1;
        while(cur<=q){
            if(nums[cur]==2){
                swap(nums,cur,q);
                q--;
            }
            else if(nums[cur]==0){
                swap(nums,cur,p);
                p++;
                cur++;
            }
            else
                cur++;
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp;
        temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void mysortColors(int[] nums) {
        int [] color = {0,0,0};
        int len = nums.length;
        for(int i = 0;i<len;i++){
            if(nums[i]==0){
                color[0]++;
            }
            else if(nums[i]==1){
                color[1]++;
            }
            else
                color[2]++;
        }
        for(int i = color[0]-1;i>=0;i--){
            nums[i] = 0;
        }
        for(int i = color[0]+color[1]-1;i>=color[0];i--){
            nums[i] = 1;
        }
        for(int i = color[0]+color[1]+color[2]-1;i>=color[0]+color[1];i--){
            nums[i] = 2;
        }
    }
    public static void main(String[] args){
        int[] case1 = {2,0,2,1,1,0};
        L075SortColors solution = new L075SortColors();
        solution.sortColors(case1);
        for (int x : case1) {
            System.out.print(x + ", ");
        }

    }
}
