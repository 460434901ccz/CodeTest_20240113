package matthew.codetest.handler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Replace task test")
class ReplaceHandlerImplTest {
    private static ReplaceHandlerImpl handler = new ReplaceHandlerImpl();

    @Test
    @DisplayName("test")
    void test() {
        System.out.println("hello test");
        handler.handle(null);
    }

}
