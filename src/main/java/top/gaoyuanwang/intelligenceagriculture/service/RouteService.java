package top.gaoyuanwang.intelligenceagriculture.service;

import top.gaoyuanwang.intelligenceagriculture.pojo.Route;
import top.gaoyuanwang.intelligenceagriculture.pojo.User;

import java.util.List;

public interface RouteService {
    Integer startRoute(Route route);

    Integer endRoute(Route route);

    Integer recordRoute(Route.Record record);

    List<Route> checkRoute(User user);

    List<Route.Record> checkOneRoute(Integer routeId);
}
