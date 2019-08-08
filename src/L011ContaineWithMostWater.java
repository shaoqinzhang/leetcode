public class L011ContaineWithMostWater {
    public int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return maxarea;
    }

//    ���ߣ�LeetCode
//    ���ӣ�https://leetcode-cn.com/problems/two-sum/solution/sheng-zui-duo-shui-de-rong-qi-by-leetcode/
//    ��Դ�����ۣ�LeetCode��
//    ����Ȩ���������С���ҵת������ϵ���߻����Ȩ������ҵת����ע��������

    public static void main(String[] args){
        L011ContaineWithMostWater a = new L011ContaineWithMostWater();
        int[] l = {1,8, 4, 5, 2, 6, 8, 3, 7};
        System.out.println(a.maxArea(l));
    }
}
