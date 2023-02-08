package top.gaoyuanwang.intelligenceagriculture.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.gaoyuanwang.intelligenceagriculture.pojo.User;
import top.gaoyuanwang.intelligenceagriculture.service.UserService;
import top.gaoyuanwang.intelligenceagriculture.util.Response;
import top.gaoyuanwang.intelligenceagriculture.util.ResponseUtil;

import javax.annotation.Resource;

@Api("用户管理")
@RestController
@Slf4j
public class UserController {
    @Resource
    UserService userService;

    @ApiOperation("用户登录")
    @RequestMapping("/userLogin")
    public Response<Integer> userLogin(User user) {
        User responseUser = userService.userLogin(user);
        return ResponseUtil.responseVerify(responseUser.getId());
    }

    @ApiOperation("用户注册")
    @RequestMapping("/userRegister")
    public Response<User> userRegister(User user) {
        User responseUser = userService.userRegister(user);
        return ResponseUtil.responseVerify(responseUser);
    }
}
