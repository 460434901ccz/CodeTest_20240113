package matthew.codetest.listener;

import matthew.codetest.model.RequestData;
import matthew.codetest.model.ResponseData;

/**
 * enhanced extensibility
 *
 * @author Matthew Cai
 */
public interface IListener {

    /**
     * do something before IHandler.handle()
     *
     * @param requestData
     */
    default void preHandle(RequestData requestData) {
        //System.out.println("pre handle listener empty implements");
    }

    /**
     * do something after IHandler.handle()
     *
     * @param requestData
     * @param responseData it hold handler result inside
     */
    default void postHandle(RequestData requestData, ResponseData responseData) {
        //System.out.println("post handle listener empty implements");
    }
}
