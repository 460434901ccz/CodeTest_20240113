package matthew.codetest.handler;

import matthew.codetest.model.RequestData;
import matthew.codetest.model.ResponseData;

import java.util.logging.Logger;


/*
#Stage 2 - advanced requirement
Instead of removing the consecutively identical characters, replace them with a
single character that comes before it alphabetically.
Example:
ccc -> b
bbb -> a
Input: abcccbad
Output:
-> abbbad, ccc is replaced by b
-> aaad, bbb is replaced by a
-> d
 */
public class ReplaceHandlerImpl extends AbstractHandler {

    private static final Logger logger = Logger.getLogger(ReplaceHandlerImpl.class.getName());

    @Override
    public ResponseData handle(RequestData requestData) {
        System.out.println("ReplaceHandlerImpl handle method");
        return null;
    }
}