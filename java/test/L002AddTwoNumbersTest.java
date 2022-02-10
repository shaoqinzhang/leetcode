import org.junit.Test;

import static org.junit.Assert.*;

public class L002AddTwoNumbersTest {

    @Test
    public void twoSum() {
        test1();
        test2();
        test3();
    }
    public void test1(){
        int[] nums = {2, 7, 11, 15};
        int[] expect = {0, 1};
        int target = 9;
        assertArrayEquals(expect, new L002AddTwoNumbers().twoSum(nums, target));
    }
    public void test2(){
        int[] nums = {3, 2, 4};
        int[] expect = {1, 2};
        int target = 6;
        assertArrayEquals(expect, new L002AddTwoNumbers().twoSum(nums, target));
    }
    public void test3(){
        int[] nums = {3,3};
        int[] expect = {0,1};
        int target = 6;
        assertArrayEquals(expect, new L002AddTwoNumbers().twoSum(nums, target));
    }
}