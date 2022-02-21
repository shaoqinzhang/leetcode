import org.junit.Test;

import static org.junit.Assert.*;

public class L003LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void lengthOfLongestSubstring() {
        String case1 = "abcabcbb";
        String case2 = "bbbbb";
        String case3 = "dvdf";
       assertEquals (L003LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(case1),3);
        assertEquals(L003LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(case2),1);
        assertEquals(L003LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(case3),3);
    }
}