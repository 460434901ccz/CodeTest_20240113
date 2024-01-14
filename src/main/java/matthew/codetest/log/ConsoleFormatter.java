package matthew.codetest.log;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

/**
 * When some scenes, like test, we need some simple format log
 *
 * @author Matthew Cai
 */
public class ConsoleFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        return record.getMessage() + "\n";
    }

}
