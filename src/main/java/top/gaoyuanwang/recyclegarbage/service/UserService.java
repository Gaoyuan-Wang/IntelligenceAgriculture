package top.gaoyuanwang.recyclegarbage.service;

import top.gaoyuanwang.recyclegarbage.pojo.User;

public interface UserService {

    User userLogin(User user);

    User userRegister(User user);

    User findUserById(User user);
}
