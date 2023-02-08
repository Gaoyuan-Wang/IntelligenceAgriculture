package top.gaoyuanwang.recyclegarbage.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.gaoyuanwang.recyclegarbage.pojo.Route;
import top.gaoyuanwang.recyclegarbage.pojo.User;

import java.util.List;

@Mapper
public interface RouteMapper {

    Integer insertRoute(Route route);

    Integer updateRoute(Route route);

    Integer selectRouteId(Route route);

    List<Route> selectRoute(User user);

    Integer insertRecord(Route.Record record);

    List<Route.Record> selectRecordsByRouteId(Integer routeId);
}
