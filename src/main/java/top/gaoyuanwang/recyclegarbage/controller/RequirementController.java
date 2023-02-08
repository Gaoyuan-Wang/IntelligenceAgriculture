package top.gaoyuanwang.recyclegarbage.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.gaoyuanwang.recyclegarbage.pojo.Requirement;
import top.gaoyuanwang.recyclegarbage.pojo.User;
import top.gaoyuanwang.recyclegarbage.service.RequirementService;
import top.gaoyuanwang.recyclegarbage.util.Response;

import javax.annotation.Resource;
import java.util.List;

@Api("订单管理")
@RestController
@Slf4j
public class RequirementController {
    @Resource
    RequirementService requirementService;

    @ApiOperation("查看订单")
    @RequestMapping("/checkRequirement")
    public Response<List<Requirement>> checkRequirement(User user){
        List<Requirement> responseRequirementList = requirementService.checkRequirement(user);
        if(responseRequirementList == null) {
            return new Response<>(false,null);
        }
        return new Response<>(true, responseRequirementList);
    }

    @ApiOperation("搜索订单")
    @RequestMapping("/checkRequirementByProduct")
    public Response<List<Requirement>> checkRequirementByProduct(String product){
        List<Requirement> responseRequirementList = requirementService.checkRequirementByProduct(product);
        if(responseRequirementList == null) {
            return new Response<>(false,null);
        }
        return new Response<>(true, responseRequirementList);
    }

    @ApiOperation("接受订单")
    @RequestMapping("/appointRequirement")
    public Response<Integer> appointRequirement(Requirement requirement){
        Integer responseRequirementId = requirementService.appointRequirement(requirement);
        if(responseRequirementId == null) {
            return new Response<>(false,null);
        }
        return new Response<>(true, null);
    }

    @ApiOperation("查看已接受订单")
    @RequestMapping("/checkAppointedRequirement")
    public Response<List<Requirement>> checkAppointedRequirement(User user){
        List<Requirement> responseRequirementList = requirementService.checkAppointedRequirement(user);
        if(responseRequirementList == null) {
            return new Response<>(false,null);
        }
        return new Response<>(true, responseRequirementList);
    }
}
