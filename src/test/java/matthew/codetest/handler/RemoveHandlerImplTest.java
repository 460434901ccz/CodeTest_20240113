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

}
