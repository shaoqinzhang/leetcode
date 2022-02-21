import org.junit.Test;

import static org.junit.Assert.*;

public class L765CouplesHoldingHandsTest {

    @Test
    public void minSwapsCouples() {
        int[] row1 = {0, 2, 1, 3};
        int[] row2 = {3, 2, 0, 1};
        int[] row3 = {5,4,2,6,3,1,0,7};
        assertEquals(new L765CouplesHoldingHands().minSwapsCouples(row1),1);
        assertEquals(new L765CouplesHoldingHands().minSwapsCouples(row2), 0);
        assertEquals(new L765CouplesHoldingHands().minSwapsCouples(row3), 2);
    }
}