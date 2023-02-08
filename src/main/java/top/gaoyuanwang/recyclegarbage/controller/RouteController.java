package top.gaoyuanwang.recyclegarbage.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.gaoyuanwang.recyclegarbage.pojo.Route;
import top.gaoyuanwang.recyclegarbage.pojo.User;
import top.gaoyuanwang.recyclegarbage.service.RouteService;
import top.gaoyuanwang.recyclegarbage.service.UserService;
import top.gaoyuanwang.recyclegarbage.util.Response;
import top.gaoyuanwang.recyclegarbage.util.UserVerification;

import javax.annotation.Resource;
import java.util.List;

@Api("路径管理")
@RestController
@Slf4j
public class RouteController {

    @Resource
    RouteService routeService;
    @Resource
    UserVerification userVerification;

    @ApiOperation("开始路径")
    @RequestMapping("/startRoute")
    public Response<Integer> startRoute(Route route){
        if(!userVerification.userVerification(route.getUserId())) {
            return new Response<>(false,null);
        }
        Integer responseRouteId = routeService.startRoute(route);
        if(responseRouteId == null) {
            return new Response<>(false,null);
        }
        return new Response<>(true, responseRouteId);
    }

    @ApiOperation("记录路径")
    @RequestMapping("/recordRoute")
    public Response<Integer> recordRoute(Route.Record record){
        Integer responseRecordId = routeService.recordRoute(record);
        if(responseRecordId == null) {
            return new Response<>(false,null);
        }
        return new Response<>(true, null);
    }

    @ApiOperation("结束路径")
    @RequestMapping("/endRoute")
    public Response<Integer> endRoute(Route route){
        Integer responseRouteId = routeService.endRoute(route);
        if(responseRouteId == null) {
            return new Response<>(false,null);
        }
        return new Response<>(true, null);
    }

    @ApiOperation("查看路径")
    @RequestMapping("/checkRoute")
    public Response<List<Route>> checkRoute(User user){
        List<Route> responseRouteList = routeService.checkRoute(user);
        if(responseRouteList == null) {
            return new Response<>(false,null);
        }
        return new Response<>(true, responseRouteList);
    }

    @ApiOperation("查看单一路径")
    @RequestMapping("/checkOneRoute")
    public Response<List<Route.Record>> checkOneRoute(Integer routeId){
        List<Route.Record> responseRecordList = routeService.checkOneRoute(routeId);
        if(responseRecordList == null) {
            return new Response<>(false,null);
        }
        return new Response<>(true, responseRecordList);
    }
}
