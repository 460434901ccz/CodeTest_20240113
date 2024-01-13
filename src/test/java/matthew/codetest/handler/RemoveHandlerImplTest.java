package matthew.codetest.handler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RemoveHandlerImplTest {
    private static RemoveHandlerImpl handler = new RemoveHandlerImpl();

    @Test
    @DisplayName("test")
    void test() {
        System.out.println("hello test");
        handler.handle(null);
    }


    @Test
    @DisplayName("test null string")
    void testNullString() {

        final String requestString = null;

    }

    @Test
    @DisplayName("test empty string")
    void testEmptyString() {

        final var requestString = "";

    }

    @Test
    @DisplayName("test Blank String")
    void testBlankString() {

        final var requestString = " ";

    }

    @Test
    @DisplayName("test illegal character aAAa")
    void testIllegalCharacterAAAa() {

        final var requestString = "aAAa";

    }

    @Test
    @DisplayName("test illegal character a??a")
    void testIllegalCharacterAXXa() {

        final var requestString = "a??a";

    }

    @Test
    @DisplayName("test illegal character a a")
    void testIllegalCharacterAEa() {

        final var requestString = "a a";

    }

    @Test
    @DisplayName("test a : a")
    void testA() {

        final var requestString = "a";
        final var expectResponseString = "a";
    }

    @Test
    @DisplayName("test aa : aa")
    void testAa() {

        final var requestString = "aa";
        final var expectResponseString = "aa";
    }


    @Test
    @DisplayName("test aaa : (empty)")
    void testAAA() {

        final var requestString = "aaa";
        final var expectResponseString = "";
    }

    @Test
    @DisplayName("test aaaa : (empty)")
    void testAaaa() {

        final var requestString = "aaaa";
        final var expectResponseString = "";
    }

    @Test
    @DisplayName("test ab : ab")
    void testAb() {

        final var requestString = "ab";
        final var expectResponseString = "ab";
    }

    @Test
    @DisplayName("test aab : aab")
    void testAab() {

        final var requestString = "aab";
        final var expectResponseString = "aab";
    }

    @Test
    @DisplayName("test aaab : b")
    void testAaab() {

        final var requestString = "aaab";
        final var expectResponseString = "b";
    }

    @Test
    @DisplayName("test aaaab : b")
    void testAaaab() {

        final var requestString = "aaaab";
        final var expectResponseString = "b";
    }

    @Test
    @DisplayName("test abb : abb")
    void testAbb() {

        final var requestString = "abb";
        final var expectResponseString = "abb";
    }

    @Test
    @DisplayName("test aabb : aabb")
    void testAabb() {

        final var requestString = "aabb";
        final var expectResponseString = "aabb";
    }

    @Test
    @DisplayName("test aaabb : bb")
    void testAaabb() {

        final var requestString = "aaabb";
        final var expectResponseString = "bb";
    }

    @Test
    @DisplayName("test aaaabb : bb")
    void testAaaabb() {

        final var requestString = "aaaabb";
        final var expectResponseString = "bb";
    }

    @Test
    @DisplayName("test abbb : a")
    void testAbbb() {

        final var requestString = "abbb";
        final var expectResponseString = "a";
    }

    @Test
    @DisplayName("test aabbb : aa")
    void testAabbb() {

        final var requestString = "aabbb";
        final var expectResponseString = "aa";
    }


    @Test
    @DisplayName("test aaabbb : (empty)")
    void testAaabbb() {

        final var requestString = "aaabbb";
        final var expectResponseString = "";
    }

    @Test
    @DisplayName("test aaaabbb : (empty)")
    void testAaaabbb() {

        final var requestString = "aaaabbb";
        final var expectResponseString = "";
    }

    @Test
    @DisplayName("test abbbb : a")
    void testAbbbb() {

        final var requestString = "abbbb";
        final var expectResponseString = "a";
    }

    @Test
    @DisplayName("test aabbbb : aa")
    void testAabbbb() {

        final var requestString = "aabbbb";
        final var expectResponseString = "aa";
    }


    @Test
    @DisplayName("test aaabbbb : (empty)")
    void testAaabbbb() {

        final var requestString = "aaabbbb";
        final var expectResponseString = "";
    }

    @Test
    @DisplayName("test aaaabbbb : (empty)")
    void testAaaabbbb() {

        final var requestString = "aaaabbbb";
        final var expectResponseString = "";
    }

    @Test
    @DisplayName("test abc : abc")
    void testAbc() {

        final var requestString = "abc";
        final var expectResponseString = "abc";
    }

    @Test
    @DisplayName("test aabc : aabc")
    void testAabc() {

        final var requestString = "aabc";
        final var expectResponseString = "aabc";
    }

    @Test
    @DisplayName("test aaabc : bc")
    void testAaabc() {

        final var requestString = "aaabc";
        final var expectResponseString = "bc";
    }

    @Test
    @DisplayName("test aaaabc : bc")
    void testAaaabc() {

        final var requestString = "aaaabc";
        final var expectResponseString = "bc";
    }

    @Test
    @DisplayName("test abbc : abbc")
    void testAbbc() {

        final var requestString = "abbc";
        final var expectResponseString = "abbc";
    }

    @Test
    @DisplayName("test aabbc : aabbc")
    void testAabbc() {

        final var requestString = "aabbc";
        final var expectResponseString = "aabbc";
    }

    @Test
    @DisplayName("test aaabbc : bbc")
    void testAaabbc() {

        final var requestString = "aaabbc";
        final var expectResponseString = "bbc";
    }

    @Test
    @DisplayName("test aaaabbc : bbc")
    void testAaaabbc() {

        final var requestString = "aaaabbc";
        final var expectResponseString = "bbc";
    }

    @Test
    @DisplayName("test abbbc : ac")
    void testAbbbc() {

        final var requestString = "abbbc";
        final var expectResponseString = "ac";
    }

    @Test
    @DisplayName("test aabbbc : ac")
    void testAabbbc() {

        final var requestString = "aabbbc";
        final var expectResponseString = "aac";
    }

    @Test
    @DisplayName("test aaabbbc : c")
    void testAaabbbc() {

        final var requestString = "aaabbbc";
        final var expectResponseString = "c";
    }

    @Test
    @DisplayName("test aaaabbbc : c")
    void testAaaabbbc() {

        final var requestString = "aaaabbbc";
        final var expectResponseString = "c";
    }

    @Test
    @DisplayName("test abbbbc : ac")
    void testAbbbbc() {

        final var requestString = "abbbbc";
        final var expectResponseString = "ac";
    }

    @Test
    @DisplayName("test aabbbbc : aac")
    void testAabbbbc() {

        final var requestString = "aabbbbc";
        final var expectResponseString = "aac";
    }

    @Test
    @DisplayName("test aaabbbbc : c")
    void testAaabbbbc() {

        final var requestString = "aaabbbbc";
        final var expectResponseString = "c";
    }

    @Test
    @DisplayName("test aaaabbbbc : c")
    void testAaaabbbbc() {

        final var requestString = "aaaabbbbc";
        final var expectResponseString = "c";
    }

    @Test
    @DisplayName("test abcc : abcc")
    void testAbcc() {

        final var requestString = "abcc";
        final var expectResponseString = "abcc";
    }

    @Test
    @DisplayName("test aaabcc : bcc")
    void testAaabcc() {

        final var requestString = "aaabcc";
        final var expectResponseString = "bcc";
    }

    @Test
    @DisplayName("test abccc : ab")
    void testAbccc() {

        final var requestString = "abccc";
        final var expectResponseString = "ab";
    }

    @Test
    @DisplayName("test aaabccc : b")
    void testAaabccc() {

        final var requestString = "aaabccc";
        final var expectResponseString = "b";
    }

    @Test
    @DisplayName("test aaaabcccc : b")
    void testAaaabcccc() {

        final var requestString = "aaaabcccc";
        final var expectResponseString = "b";
    }

    @Test
    @DisplayName("test aaabbbccc : (empty)")
    void testAaabbbccc() {

        final var requestString = "aaabbbccc";
        final var expectResponseString = "";
    }

    @Test
    @DisplayName("test aaaabbbbcccc : (empty)")
    void testAaaabbbbcccc() {

        final var requestString = "aaaabbbbcccc";
        final var expectResponseString = "";
    }

    @Test
    @DisplayName("test aaabcccddeeefggg : bddf")
    void testAaabcccddeeefggg() {

        final var requestString = "aaabcccddeeefggg";
        final var expectResponseString = "bddf";
    }

    @Test
    @DisplayName("test aaabcccddeeefgggg : bddf")
    void testAaabcccddeeefgggg() {

        final var requestString = "aaabcccddeeefgggg";
        final var expectResponseString = "bddf";
    }

    @Test
    @DisplayName("test aaabcccddeeefggggh : bddfh")
    void testAaabcccddeeefggggh() {

        final var requestString = "aaabcccddeeefggggh";
        final var expectResponseString = "bddfh";
    }

    @Test
    @DisplayName("test abbbccccdeeeefggg : adf")
    void testAbbbccccdeeeefggg() {

        final var requestString = "abbbccccdeeeefggg";
        final var expectResponseString = "adf";
    }

    @Test
    @DisplayName("test abbba : aa")
    void testAbbba() {

        final var requestString = "abbba";
        final var expectResponseString = "aa";
    }

    @Test
    @DisplayName("test abbbaa : (empty)")
    void testAbbbaa() {

        final var requestString = "abbbaa";
        final var expectResponseString = "";
    }

    @Test
    @DisplayName("test abbbba : aa")
    void testAbbbba() {

        final var requestString = "abbbba";
        final var expectResponseString = "aa";
    }

    @Test
    @DisplayName("test abbbbaa : (empty)")
    void testAbbbbaa() {

        final var requestString = "abbbbaa";
        final var expectResponseString = "";
    }

    @Test
    @DisplayName("test aabbba : (empty)")
    void testAabbba() {

        final var requestString = "aabbba";
        final var expectResponseString = "";
    }

    @Test
    @DisplayName("test aabbbaa : (empty)")
    void testAabbbaa() {

        final var requestString = "aabbbaa";
        final var expectResponseString = "";
    }

    @Test
    @DisplayName("test aabbbbaa : (empty)")
    void testAabbbbaa() {

        final var requestString = "aabbbbaa";
        final var expectResponseString = "";
    }


    @Test
    @DisplayName("test abbccccba : aa")
    void testAbbcccba() {

        final var requestString = "abbccccba";
        final var expectResponseString = "aa";
    }

    @Test
    @DisplayName("test abbcccccba : aa")
    void testAbbccccba() {

        final var requestString = "abbcccccba";
        final var expectResponseString = "aa";
    }

    @Test
    @DisplayName("test abbccccbba : aa")
    void testAbbccccbba() {

        final var requestString = "abbccccbba";
        final var expectResponseString = "aa";
    }

    @Test
    @DisplayName("test abbccccbbaa : (empty)")
    void testAbbccccbbaa() {

        final var requestString = "abbccccbbaa";
        final var expectResponseString = "";
    }

    @Test
    @DisplayName("test aabbccccbbaa : (empty)")
    void testAabbccccbbaa() {

        final var requestString = "aabbccccbbaa";
        final var expectResponseString = "";
    }

    @Test
    @DisplayName("test abbcccbdeeed : add")
    void testAbbcccbdeeed() {

        final var requestString = "abbcccbdeeed";
        final var expectResponseString = "add";
    }

    @Test
    @DisplayName("test abbcccbbddeeeed : a")
    void testAbbcccbbddeeeed() {

        final var requestString = "abbcccbbddeeeed";
        final var expectResponseString = "a";
    }

    @Test
    @DisplayName("test aabbcccbbddeeeedd : aa")
    void testAabbcccbbddeeeedd() {

        final var requestString = "aabbcccbbddeeeedd";
        final var expectResponseString = "aa";
    }

    @Test
    @DisplayName("test aabbbcccaaddaadd : ddaadd")
    void testAabbbcccaaddaadd() {

        final var requestString = "aabbbcccaaddaadd";
        final var expectResponseString = "ddaadd";
    }


    @Test
    void testRandom() {

    }

}
