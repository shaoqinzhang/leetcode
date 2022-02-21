import org.junit.Test;

import static org.junit.Assert.*;

public class L056MergeIntervalsTest {

    @Test
    public void merge() {
        int[][] case1 ={{1,3},{2,6},{8,10},{15,18}};
        int[][] expect1 = {{1, 6}, {8, 10}, {15, 18}};
        L056MergeIntervals solution = new L056MergeIntervals();
        assertArrayEquals(expect1,solution.merge(case1));
    }
}