package C18;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class E01Test {
    @ParameterizedTest
    @CsvSource({"silent, listen, true", "apple, pear, false"})
    void testAnagrams(String word1, String word2, Boolean expectedResult) {
        E01 w1 = new E01(word1);
        E01 w2 = new E01(word2);

        assertEquals(w1.isAnagramOf(w2), expectedResult);
    }
}