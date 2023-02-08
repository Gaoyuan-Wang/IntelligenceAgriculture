package top.gaoyuanwang.recyclegarbage.pojo;

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
