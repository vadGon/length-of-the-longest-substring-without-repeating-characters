import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void lengthOfLongestSubstring1() {

        assertEquals(1, Solution.lengthOfLongestSubstring("bbbbb"));
    }
    @org.junit.jupiter.api.Test
    void lengthOfLongestSubstring2() {

        assertEquals(3, Solution.lengthOfLongestSubstring("pwwkew"));
    }
    @org.junit.jupiter.api.Test
    void lengthOfLongestSubstring3() {

        assertEquals(3, Solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @org.junit.jupiter.api.Test
    void lengthOfLongestSubstring4() {

        assertEquals(0, Solution.lengthOfLongestSubstring(""));
    }

    @org.junit.jupiter.api.Test
    void lengthOfLongestSubstring6() {

        assertEquals(1, Solution.lengthOfLongestSubstring("a"));
    }

    @org.junit.jupiter.api.Test
    void lengthOfLongestSubstring7() {

        assertEquals(2, Solution.lengthOfLongestSubstring("au"));
    }

    @org.junit.jupiter.api.Test
    void lengthOfLongestSubstring8() {

        assertEquals(10, Solution.lengthOfLongestSubstring("qwertyuiopqwertyueieuey"));
    }
}