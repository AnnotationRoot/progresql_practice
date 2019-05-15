package utils;

public enum StatusCode {
    /**
     * internalKey
     * key不能重复，value也不能重复
     */
    SUCCESS(200, "success", "成功"),

    FAILURE(2222, "failure", "失败"),

    BAD_PARAM(400, "param_error", "参数错误"),

    UNAUTHORIZED(403, "unauthorized", "未授权"),

    NOT_EXISTS(404, "not_exists", "资源不存在"),

    SERVER_ERROR(500, "server_error", "服务器繁忙"),

    UPLOAD_FAILED(5001, "file_upload_error", "文件上传失败！");
    /**
     * 状态吗的key值
     */
    private int key;
    /**
     * 国际化key 通过这个找国际化文案
     */
    private String internalKey;
    /**
     * 错误描述
     */
    private String msg;

    StatusCode(int key, String internalKey, String msg) {
        this.key = key;
        this.msg = msg;
        this.internalKey = internalKey;
    }

    public String getInternalKey() {
        return internalKey;
    }

    public String getMsg() {
        return msg;
    }

    public int getKey() {
        return key;
    }


}