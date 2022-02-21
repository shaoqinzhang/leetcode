import org.junit.Test;

import static org.junit.Assert.*;

public class L679_24GameTest {

    @Test
    public void judgePoint24() {
        L679_24Game solution = new L679_24Game();
        int[] cards1 = {3,3,8,8};
        boolean expect1 = true;
        assertEquals(expect1, solution.judgePoint24(cards1));

    }
}