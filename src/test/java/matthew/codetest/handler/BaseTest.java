package matthew.codetest.handler;

import matthew.codetest.log.LogConfigInitializer;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Some actions that each task needs to perform
 *
 * @author Matthew Cai
 */
class BaseTest {
    private Pattern pattern = Pattern.compile(IHandler.REGEX_STRING);

    static {
        LogConfigInitializer.init();
    }

    /**
     * Check whether there are more than three consecutive characters
     *
     * @param result the handle result to be checked
     * @return whether consecutive characters exist
     */
    boolean notExistMoreThanThreeConsecutiveCharacters(String result) {
        Matcher matcher = pattern.matcher(result);
        return !matcher.find();
    }

    static String generateRandomLowercaseString(int length) {
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();

        char c = 'a';
        for (int i = 0; i < length; i++) {

            for (int j = 0; j < rand.nextInt(5); j++) {
                c = (char) (rand.nextInt('z' - 'a') + 'a'); // 生成范围在 a-z 之间的随机小写字母
            }
            sb.append(c);
        }

        return sb.toString();
    }
}
