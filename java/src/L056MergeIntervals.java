import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L056MergeIntervals {
    public int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<int[]>();
        int len = intervals.length;
        if(len<=1)
            return intervals;
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        for(int i = 0;i < intervals.length;i++){
            int left = intervals[i][0];
            int right = intervals[i][1];
            while (i<intervals.length-1&&intervals[i + 1][0] <= right){
                right = Math.max(intervals[i + 1][1],right);
                i++;
            }
            res.add(new int[]{left,right});

        }
        return res.toArray(new int[0][]);

    }
}
