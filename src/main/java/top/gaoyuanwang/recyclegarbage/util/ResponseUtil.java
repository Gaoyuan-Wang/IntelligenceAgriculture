package top.gaoyuanwang.recyclegarbage.util;

public class ResponseUtil {

    public static <T> Response<T> responseVerify(T data) {
        if(data == null) return new Response<>(false, null);
        else return new Response<>(true, data);
    }
}
