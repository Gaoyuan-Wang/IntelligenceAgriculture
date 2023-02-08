package top.gaoyuanwang.recyclegarbage.util;

import lombok.Data;

@Data
public class Response<T> {
    private final boolean success;
    private final T data;
    public Response(boolean success, T data) {
        this.success = success;
        this.data = data;
    }
}
