package utils;


/**
 *
 * @author Administrator
 * @date 2017/12/11
 */

public class BaseMsg<T> {
    /**
     * 状态码
     */
    private int code;

    /**
     * 返回信息描述
     */
    private String msg;

    /**
     * 数据
     */
    private T data;

    public BaseMsg() {

    }

    public BaseMsg(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseMsg(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseMsg{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
