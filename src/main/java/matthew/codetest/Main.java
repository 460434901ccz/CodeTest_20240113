package matthew.codetest;

import matthew.codetest.handler.IHandler;
import matthew.codetest.handler.RemoveHandlerImpl;
import matthew.codetest.handler.ReplaceHandlerImpl;
import matthew.codetest.model.RequestData;
import matthew.codetest.model.ResponseData;

import java.time.LocalTime;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        logger.info("localTime:" + localTime);


        IHandler handler1 = RemoveHandlerImpl.getInstance();
        RequestData requestData1 = new RequestData();
        requestData1.setTaskId(1);
        requestData1.setTaskType(IHandler.TASK_TYPE_01);
        requestData1.setOriginalInputString("aabcccbbad");
        ResponseData responseData1 = handler1.handle(requestData1);
        logger.info(responseData1.getOutputString());

        IHandler handler2 = ReplaceHandlerImpl.getInstance();
        RequestData requestData2 = new RequestData();
        requestData2.setTaskId(1);
        requestData2.setTaskType(IHandler.TASK_TYPE_02);
        requestData2.setOriginalInputString("abcccbad");
        ResponseData responseData2 = handler2.handle(requestData2);
        logger.info(responseData2.getOutputString());


    }

}
