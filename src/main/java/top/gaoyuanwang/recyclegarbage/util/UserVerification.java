package top.gaoyuanwang.recyclegarbage.util;

import org.springframework.stereotype.Component;
import top.gaoyuanwang.recyclegarbage.pojo.User;
import top.gaoyuanwang.recyclegarbage.service.UserService;

import javax.annotation.Resource;

@Component
public class UserVerification {
    @Resource
    private UserService userService;

    public boolean userVerification(Integer id) {
        return userService.findUserById(new User(id)) == null;
    }
}
