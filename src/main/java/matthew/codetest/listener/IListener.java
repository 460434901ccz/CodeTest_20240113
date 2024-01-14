package matthew.codetest.listener;

import matthew.codetest.model.RequestData;
import matthew.codetest.model.ResponseData;

public interface IListener {
    default void preHandle(RequestData requestData) {
        //System.out.println("pre handle listener empty implements");
    }

    default void postHandle(RequestData requestData, ResponseData responseData) {
        //System.out.println("post handle listener empty implements");
    }
}
