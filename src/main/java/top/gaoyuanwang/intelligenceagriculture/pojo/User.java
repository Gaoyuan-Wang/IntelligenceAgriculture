package top.gaoyuanwang.intelligenceagriculture.pojo;

import lombok.Data;

@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    public User(Integer id) {
        this.id = id;
    }
}
