package matthew.codetest.handler;

import matthew.codetest.listener.ConsoleLogListener;
import matthew.codetest.model.RequestData;
import matthew.codetest.model.ResponseData;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * #Stage 2 - advanced requirement
 * Instead of removing the consecutively identical characters, replace them with a
 * single character that comes before it alphabetically.
 * Example:
 * ccc -> b
 * bbb -> a
 * Input: abcccbad
 * Output:
 * -> abbbad, ccc is replaced by b
 * -> aaad, bbb is replaced by a
 * -> d
 *
 * @author Matthew Cai
 */
@DisplayName("Replace task test")
class ReplaceHandlerImplTest extends BaseTest {
    private static ReplaceHandlerImpl handler;


    @BeforeAll
    static void beforeAll() {
        handler = ReplaceHandlerImpl.getInstance();
        handler.addHandleListeners(new ConsoleLogListener());
    }

    @Test
    @DisplayName("test null string")
    void testNullString() {

        final String requestString = null;
        final var expectResponseErrorMsg = IHandler.ERROR_MSG_NULL_OR_EMPTY_INPUT;

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertNull(responseData.getOutputString());
        assertEquals(expectResponseErrorMsg, responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test empty string")
    void testEmptyString() {

        final var requestString = "";
        final var expectResponseErrorMsg = IHandler.ERROR_MSG_NULL_OR_EMPTY_INPUT;

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertNull(responseData.getOutputString());
        assertEquals(expectResponseErrorMsg, responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test Blank String")
    void testBlankString() {

        final var requestString = " ";
        final var expectResponseErrorMsg = IHandler.ERROR_MSG_NULL_OR_EMPTY_INPUT;

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertNull(responseData.getOutputString());
        assertEquals(expectResponseErrorMsg, responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test illegal character aAAa")
    void testIllegalCharacterAAAa() {

        final var requestString = "aAAa";
        final var expectResponseErrorMsg = IHandler.ERROR_MSG_ILLEGAL_CHARACTER_EXISTS;

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertNull(responseData.getOutputString());
        assertEquals(expectResponseErrorMsg, responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test illegal character a??a")
    void testIllegalCharacterAXXa() {

        final var requestString = "a??a";
        final var expectResponseErrorMsg = IHandler.ERROR_MSG_ILLEGAL_CHARACTER_EXISTS;

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertNull(responseData.getOutputString());
        assertEquals(expectResponseErrorMsg, responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test illegal character a a")
    void testIllegalCharacterAEa() {

        final var requestString = "a a";
        final var expectResponseErrorMsg = IHandler.ERROR_MSG_ILLEGAL_CHARACTER_EXISTS;

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertNull(responseData.getOutputString());
        assertEquals(expectResponseErrorMsg, responseData.getErrorMsg());
    }


    @Test
    @DisplayName("test a : a ")
    void testA() {

        final var requestString = "a";
        final var expectResponseString = "a";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aa : aa ")
    void testAa() {

        final var requestString = "aa";
        final var expectResponseString = "aa";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaa : (empty) ")
    void testAaa() {

        final var requestString = "aaa";
        final var expectResponseString = "";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaaa : (empty) ")
    void testAaaa() {

        final var requestString = "aaaa";
        final var expectResponseString = "";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test b : b ")
    void testB() {

        final var requestString = "b";
        final var expectResponseString = "b";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test bb : bb ")
    void testBb() {

        final var requestString = "bb";
        final var expectResponseString = "bb";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test bbb : a ")
    void testBbb() {

        final var requestString = "bbb";
        final var expectResponseString = "a";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test bbbb : a ")
    void testBbbb() {

        final var requestString = "bbbb";
        final var expectResponseString = "a";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test ab : ab ")
    void testAb() {

        final var requestString = "ab";
        final var expectResponseString = "ab";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aab : aab ")
    void testAab() {

        final var requestString = "aab";
        final var expectResponseString = "aab";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaab : b ")
    void testAaab() {

        final var requestString = "aaab";
        final var expectResponseString = "b";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaaab : b ")
    void testAaaab() {

        final var requestString = "aaaab";
        final var expectResponseString = "b";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test abb : abb ")
    void testAbb() {

        final var requestString = "abb";
        final var expectResponseString = "abb";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aabb : aabb ")
    void testAabb() {

        final var requestString = "aabb";
        final var expectResponseString = "aabb";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaabb : bb ")
    void testAaabb() {

        final var requestString = "aaabb";
        final var expectResponseString = "bb";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaaabb : bb ")
    void testAaaabb() {

        final var requestString = "aaaabb";
        final var expectResponseString = "bb";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test abbb : aa ")
    void testAbbb() {

        final var requestString = "abbb";
        final var expectResponseString = "aa";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aabbb : aaa : (empty) ")
    void testAabbb() {

        final var requestString = "aabbb";
        final var expectResponseString = "";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaabbb : a ")
    void testAaabbb() {

        final var requestString = "aaabbb";
        final var expectResponseString = "a";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaaabbb : a ")
    void testAaaabbb() {

        final var requestString = "aaaabbb";
        final var expectResponseString = "a";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test abbbb : aa ")
    void testAbbbb() {

        final var requestString = "abbbb";
        final var expectResponseString = "aa";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aabbbb : aaa : (empty) ")
    void testAabbbb() {

        final var requestString = "aabbbb";
        final var expectResponseString = "";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaabbbb : a ")
    void testAaabbbb() {

        final var requestString = "aaabbbb";
        final var expectResponseString = "a";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaaabbbb : a ")
    void testAaaabbbb() {

        final var requestString = "aaaabbbb";
        final var expectResponseString = "a";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test ba : ba ")
    void testBa() {

        final var requestString = "ba";
        final var expectResponseString = "ba";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test bba : bba ")
    void testBba() {

        final var requestString = "bba";
        final var expectResponseString = "bba";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test bbba : aa ")
    void testBbba() {

        final var requestString = "bbba";
        final var expectResponseString = "aa";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test bbbba : aa ")
    void testBbbba() {

        final var requestString = "bbbba";
        final var expectResponseString = "aa";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test baa : baa ")
    void testBaa() {

        final var requestString = "baa";
        final var expectResponseString = "baa";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test bbaa : bbaa ")
    void testBbaa() {

        final var requestString = "bbaa";
        final var expectResponseString = "bbaa";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test bbbaa : aaa : (empty) ")
    void testBbbaa() {

        final var requestString = "bbbaa";
        final var expectResponseString = "";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test bbbbaa : aaa : (empty) ")
    void testBbbbaa() {

        final var requestString = "bbbbaa";
        final var expectResponseString = "";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test baaa : b ")
    void testBaaa() {

        final var requestString = "baaa";
        final var expectResponseString = "b";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test bbaaa : bb ")
    void testBbaaa() {

        final var requestString = "bbaaa";
        final var expectResponseString = "bb";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test bbbaaa : a ")
    void testBbbaaa() {

        final var requestString = "bbbaaa";
        final var expectResponseString = "a";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test abc : abc ")
    void testAbc() {

        final var requestString = "abc";
        final var expectResponseString = "abc";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aabc : aabc ")
    void testAabc() {

        final var requestString = "aabc";
        final var expectResponseString = "aabc";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaabc : bc ")
    void testAaabc() {

        final var requestString = "aaabc";
        final var expectResponseString = "bc";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaaabc : bc ")
    void testAaaabc() {

        final var requestString = "aaaabc";
        final var expectResponseString = "bc";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }


    @Test
    @DisplayName("test abbc : abbc ")
    void testAbbc() {

        final var requestString = "abbc";
        final var expectResponseString = "abbc";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aabbc : aabbc ")
    void testAabbc() {

        final var requestString = "aabbc";
        final var expectResponseString = "aabbc";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaabbc : bbc ")
    void testAaabbc() {

        final var requestString = "aaabbc";
        final var expectResponseString = "bbc";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaaabbc : bbc ")
    void testAaaabbc() {

        final var requestString = "aaaabbc";
        final var expectResponseString = "bbc";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }


    @Test
    @DisplayName("test abbbc : aac ")
    void testAbbbc() {

        final var requestString = "abbbc";
        final var expectResponseString = "aac";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaabbbc : ac ")
    void testAaabbbc() {

        final var requestString = "aaabbbc";
        final var expectResponseString = "ac";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaaabbbbc : ac ")
    void testAaaabbbbc() {

        final var requestString = "aaaabbbbc";
        final var expectResponseString = "ac";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test abcc : abcc ")
    void testAbcc() {

        final var requestString = "abcc";
        final var expectResponseString = "abcc";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test abccc : abb ")
    void testAbccc() {

        final var requestString = "abccc";
        final var expectResponseString = "abb";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }


    @Test
    @DisplayName("test abbccc : abbb : aa ")
    void testAbbccc() {

        final var requestString = "abbccc";
        final var expectResponseString = "aa";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test abbbccc : aab ")
    void testAbbbccc() {

        final var requestString = "abbbccc";
        final var expectResponseString = "aab";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aabbccc : aabbb : aaa : (empty) ")
    void testAabbccc() {

        final var requestString = "aabbccc";
        final var expectResponseString = "";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaabbccc : bbb : a ")
    void testAaabbccc() {

        final var requestString = "aaabbccc";
        final var expectResponseString = "a";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaabccc : bb ")
    void testAaabccc() {

        final var requestString = "aaabccc";
        final var expectResponseString = "bb";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaaabcccc : bb ")
    void testAaaabcccc() {

        final var requestString = "aaaabcccc";
        final var expectResponseString = "bb";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaaabbbcccc : ab ")
    void testAaaabbbcccc() {

        final var requestString = "aaaabbbcccc";
        final var expectResponseString = "ab";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaaabbbbcccc : ab ")
    void testAaaabbbbcccc() {

        final var requestString = "aaaabbbbcccc";
        final var expectResponseString = "ab";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test abbbcccd : aabd ")
    void testAbbbcccd() {

        final var requestString = "abbbcccd";
        final var expectResponseString = "aabd";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test abbbcddd : aacc ")
    void testAbbbcddd() {

        final var requestString = "abbbcddd";
        final var expectResponseString = "aacc";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test abbbcddde : aacce ")
    void testAbbbcddde() {

        final var requestString = "abbbcddde";
        final var expectResponseString = "aacce";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaabbbcdddeee : accd ")
    void testAaabbbcdddeee() {

        final var requestString = "aaabbbcdddeee";
        final var expectResponseString = "accd";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }


    @Test
    @DisplayName("test aaabbbccdddeee : acccd : abd ")
    void testAaabbbccdddeee() {

        final var requestString = "aaabbbccdddeee";
        final var expectResponseString = "abd";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }


    @Test
    @DisplayName("test abbbcccdeeefff : aabdde ")
    void testAbbbcccdeeefff() {

        final var requestString = "abbbcccdeeefff";
        final var expectResponseString = "aabdde";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }


    @Test
    @DisplayName("test abbbcccdeeefffg : aabddeg ")
    void testAbbbcccdeeefffg() {

        final var requestString = "abbbcccdeeefffg";
        final var expectResponseString = "aabddeg";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aaabcccddeeefggg : bbdddff : bbcff ")
    void testAaabcccddeeefggg() {

        final var requestString = "aaabcccddeeefggg";
        final var expectResponseString = "bbcff";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test abbba : aaa : (empty) ")
    void testAbbba() {

        final var requestString = "abbba";
        final var expectResponseString = "";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }


    @Test
    @DisplayName("test abbbba : aaa : (empty) ")
    void testAbbbba() {

        final var requestString = "abbbba";
        final var expectResponseString = "";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }


    @Test
    @DisplayName("test abbbaa : aaa : (empty) ")
    void testAbbbaa() {

        final var requestString = "abbbaa";
        final var expectResponseString = "";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }


    @Test
    @DisplayName("test aabbba : aaa : (empty) ")
    void testAabbba() {

        final var requestString = "aabbba";
        final var expectResponseString = "";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }


    @Test
    @DisplayName("test aabbbaa : aaaa : (empty) ")
    void testAabbbaa() {

        final var requestString = "aabbbaa";
        final var expectResponseString = "";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test aabbbbaa : aaaa : (empty) ")
    void testAabbbbaa() {

        final var requestString = "aabbbbaa";
        final var expectResponseString = "";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test abbcccba : abbba : aaa : (empty) ")
    void testAbbcccba() {

        final var requestString = "abbcccba";
        final var expectResponseString = "";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test abbccccbaa : abbbbaa : aaaa : (empty) ")
    void testAbbccccbaa() {

        final var requestString = "abbccccbaa";
        final var expectResponseString = "";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test abbcccdeeed : abbbddd : aac ")
    void testAbbcccdeeed() {

        final var requestString = "abbcccdeeed";
        final var expectResponseString = "aac";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }

    @Test
    @DisplayName("test abbcccbbdeefffeg : abbbbbdeeeeg : aaddg ")
    void testAbbcccbbdeefffeg() {

        final var requestString = "abbcccbbdeefffeg";
        final var expectResponseString = "aaddg";

        ResponseData responseData = handler.handle(new RequestData(1, IHandler.TASK_TYPE_02, requestString));

        assertEquals(expectResponseString, responseData.getOutputString());
        assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
        assertNull(responseData.getErrorMsg());
    }


    @Test
    void testRandom() {
        for (int i = 0; i < 100; i++) {
            RequestData requestData = new RequestData(1, IHandler.TASK_TYPE_02, generateRandomLowercaseString(1024));
            ResponseData responseData = handler.handle(requestData);
            assertTrue(notExistMoreThanThreeConsecutiveCharacters(responseData.getOutputString()));
            assertNull(responseData.getErrorMsg());
        }
    }
}
