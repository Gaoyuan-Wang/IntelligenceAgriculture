package top.gaoyuanwang.intelligenceagriculture.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.gaoyuanwang.intelligenceagriculture.pojo.Route;
import top.gaoyuanwang.intelligenceagriculture.pojo.User;
import top.gaoyuanwang.intelligenceagriculture.service.RouteService;
import top.gaoyuanwang.intelligenceagriculture.service.UserService;
import top.gaoyuanwang.intelligenceagriculture.util.Response;
import top.gaoyuanwang.intelligenceagriculture.util.ResponseUtil;

import javax.annotation.Resource;
import javax.websocket.server.PathParam;
import java.util.List;

@Api("路径管理")
@RestController
@Slf4j
public class RouteController {

    @Resource
    RouteService routeService;
    @Resource
    UserService userservice;

    @ApiOperation("开始路径")
    @RequestMapping("/startRoute")
    public Response<Integer> startRoute(Route route){
        if(userservice.findUserById(new User(route.getUserId())) == null) {
            return new Response<>(false,null);
        }
        Integer responseRouteId = routeService.startRoute(route);
        return ResponseUtil.responseVerify(responseRouteId);
    }

    @ApiOperation("记录路径")
    @RequestMapping("/recordRoute")
    public Response<Integer> recordRoute(@PathParam("id")User user, Route.Record record){
        if(userservice.findUserById(user) == null) {
            return new Response<>(false,null);
        }
        Integer responseRecordId = routeService.recordRoute(record);
        return ResponseUtil.responseVerify(responseRecordId);
    }

    @ApiOperation("结束路径")
    @RequestMapping("/endRoute")
    public Response<Integer> endRoute(Route route){
        if(userservice.findUserById(new User(route.getUserId())) == null) {
            return new Response<>(false,null);
        }
        Integer responseRouteId = routeService.endRoute(route);
        return ResponseUtil.responseVerify(responseRouteId);
    }

    @ApiOperation("查看路径")
    @RequestMapping("/checkRoute")
    public Response<List<Route>> checkRoute(User user){
        if(userservice.findUserById(user) == null) {
            return new Response<>(false,null);
        }
        List<Route> responseRouteList = routeService.checkRoute(user);
        return ResponseUtil.responseVerify(responseRouteList);
    }

    @ApiOperation("查看单一路径")
    @RequestMapping("/checkOneRoute")
    public Response<List<Route.Record>> checkOneRoute(@PathParam("id")User user, Integer routeId){
        if(userservice.findUserById(user) == null) {
            return new Response<>(false,null);
        }
        List<Route.Record> responseRecordList = routeService.checkOneRoute(routeId);
        return ResponseUtil.responseVerify(responseRecordList);
    }
}
