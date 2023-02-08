package top.gaoyuanwang.recyclegarbage.service;

import top.gaoyuanwang.recyclegarbage.pojo.Route;
import top.gaoyuanwang.recyclegarbage.pojo.User;

import java.util.List;

public interface RouteService {
    Integer startRoute(Route route);

    Integer endRoute(Route route);

    Integer recordRoute(Route.Record record);

    List<Route> checkRoute(User user);

    List<Route.Record> checkOneRoute(Integer routeId);
}
