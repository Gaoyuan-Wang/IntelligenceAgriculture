package top.gaoyuanwang.recyclegarbage.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.gaoyuanwang.recyclegarbage.mapper.UserMapper;
import top.gaoyuanwang.recyclegarbage.pojo.User;
import top.gaoyuanwang.recyclegarbage.service.UserService;

import javax.annotation.Resource;

@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public User userLogin(User user) {
        return userMapper.selectSingleUser(user);
    }

    @Override
    public User userRegister(User user) {
        if(userMapper.selectSingleUser(user) != null) {
            return null;
        }
        if(userMapper.insertUser(user) == 1){
            return userMapper.selectSingleUser(user);
        }else{
            return null;
        }
    }

    @Override
    public User findUserById(User user) {
        return userMapper.selectUserById(user);
    }
}
