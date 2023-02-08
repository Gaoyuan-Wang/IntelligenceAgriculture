package top.gaoyuanwang.intelligenceagriculture.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.gaoyuanwang.intelligenceagriculture.pojo.Requirement;
import top.gaoyuanwang.intelligenceagriculture.pojo.User;
import top.gaoyuanwang.intelligenceagriculture.service.RequirementService;
import top.gaoyuanwang.intelligenceagriculture.service.UserService;
import top.gaoyuanwang.intelligenceagriculture.util.Response;
import top.gaoyuanwang.intelligenceagriculture.util.ResponseUtil;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.List;

@Api("订单管理")
@RestController
@Slf4j
public class RequirementController {
    @Resource
    RequirementService requirementService;
    @Resource
    UserService userService;

    @ApiOperation("查看订单")
    @RequestMapping("/checkRequirement")
    public Response<List<Requirement>> checkRequirement(User user){
        if (userService.findUserById(user) == null) {
            return new Response<>(false,null);
        }
        List<Requirement> responseRequirementList = requirementService.checkRequirement(user);
        return ResponseUtil.responseVerify(responseRequirementList);
    }

    @ApiOperation("搜索订单")
    @RequestMapping("/checkRequirementByProduct")
    public Response<List<Requirement>> checkRequirementByProduct(@PathParam("id")User user, String product){
        if (userService.findUserById(user) == null) {
            return new Response<>(false,null);
        }
        List<Requirement> responseRequirementList = requirementService.checkRequirementByProduct(product);
        return ResponseUtil.responseVerify(responseRequirementList);
    }

    @ApiOperation("接受订单")
    @RequestMapping("/appointRequirement")
    public Response<Integer> appointRequirement(Requirement requirement){
        if (userService.findUserById(new User(requirement.getUserId())) == null) {
            return new Response<>(false,null);
        }
        Integer responseRequirementId = requirementService.appointRequirement(requirement);
        return ResponseUtil.responseVerify(responseRequirementId);
    }

    @ApiOperation("查看已接受订单")
    @RequestMapping("/checkAppointedRequirement")
    public Response<List<Requirement>> checkAppointedRequirement(User user){
        if (userService.findUserById(user) == null) {
            return new Response<>(false,null);
        }
        List<Requirement> responseRequirementList = requirementService.checkAppointedRequirement(user);
        return ResponseUtil.responseVerify(responseRequirementList);
    }
}
