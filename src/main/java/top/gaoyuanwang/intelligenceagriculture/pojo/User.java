package top.gaoyuanwang.intelligenceagriculture.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class User{
    private Integer id;
    private String username;
    private String password;
    public User(Integer id) {
        this.id = id;
    }
}
