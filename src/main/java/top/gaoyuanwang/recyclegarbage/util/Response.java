package top.gaoyuanwang.recyclegarbage.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class Response<T> {
    @NonNull
    private Boolean status;
    private T data;

    public Response<T> responseVerify(T data) {
        if(data == null) return new Response<>(false, null);
        else return new Response<>(true, data);
    }
}
