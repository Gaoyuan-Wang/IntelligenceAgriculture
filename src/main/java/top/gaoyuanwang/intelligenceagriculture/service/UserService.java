package top.gaoyuanwang.intelligenceagriculture.service;

import top.gaoyuanwang.intelligenceagriculture.pojo.User;

public interface UserService {

    User userLogin(User user);

    User userRegister(User user);

    User findUserById(User user);
}
