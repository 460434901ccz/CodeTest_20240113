package matthew.codetest.handler;

import matthew.codetest.model.RequestData;
import matthew.codetest.model.ResponseData;

import java.util.logging.Logger;


/*
For a given string that only contains alphabet characters a-z, if 3 or more consecutive
characters are identical, remove them from the string. Repeat this process until
there is no more than 3 identical characters sitting besides each other.
Example:
Input: aabcccbbad
Output:
-> aabbbad
-> aaad
-> d
 */
public class RemoveHandlerImpl extends AbstractHandler {

    private static final Logger logger = Logger.getLogger(RemoveHandlerImpl.class.getName());

    @Override
    public ResponseData handle(RequestData requestData) {
        System.out.println("RemoveHandlerImpl handle method");
        return null;
    }
}