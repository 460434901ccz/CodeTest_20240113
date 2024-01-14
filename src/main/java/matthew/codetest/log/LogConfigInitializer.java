package matthew.codetest.log;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;

public class LogConfigInitializer {

    public static void init() {
        InputStream inputStream = LogConfigInitializer.class.getClassLoader().getResourceAsStream("logging.properties");
        if (inputStream == null) return;

        LogManager logManager = LogManager.getLogManager();
        try {
            logManager.readConfiguration(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
