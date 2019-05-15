package utils;


import java.util.HashMap;
import java.util.Map;

/**
 * @author Administrator
 * @date 2017/12/12
 */
public class SuccessMsg extends BaseMsg {
    /**
     * 一个参数的时候key是这个
     */
    public static final String ONE_MESSAGE_KEY = "message";

    public SuccessMsg() {
        this(null);
    }

    /**
     * 对象用这个
     *
     * @param data
     */
    public SuccessMsg(Object data) {

        super(StatusCode.SUCCESS.getKey(), StatusCode.SUCCESS.getMsg(), data);
    }

    public SuccessMsg(StatusCode statusCode){
        super(statusCode.getKey(),statusCode.getMsg());
    }

    /**
     * 单个值用这个
     *
     * @param key
     * @param data
     */
    public SuccessMsg(String key, Object data) {
        Map<String, Object> dataMap = new HashMap<String, Object>();
        dataMap.put(key, data);
        setCode(StatusCode.SUCCESS.getKey());
        setMsg(StatusCode.SUCCESS.getMsg());
        setData(dataMap);
    }
}
