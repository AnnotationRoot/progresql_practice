package utils;

/**
 *
 * @author Administrator
 * @date 2018/1/7
 */
public class FailureMsg extends BaseMsg {

    public FailureMsg(int code, String msg) {
        super(code, msg);
    }
    public FailureMsg(StatusCode statusCode){
        super(statusCode.getKey(),statusCode.getMsg());
    }

    public FailureMsg(String msg) {
        super(400, msg);
    }
}
