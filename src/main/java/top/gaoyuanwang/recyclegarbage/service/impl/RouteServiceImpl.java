package top.gaoyuanwang.recyclegarbage.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.gaoyuanwang.recyclegarbage.mapper.RouteMapper;
import top.gaoyuanwang.recyclegarbage.pojo.Route;
import top.gaoyuanwang.recyclegarbage.pojo.User;
import top.gaoyuanwang.recyclegarbage.service.RouteService;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
@Slf4j
public class RouteServiceImpl implements RouteService {
    @Resource
    RouteMapper routeMapper;

    @Override
    public Integer startRoute(Route route) {
        routeMapper.insertRoute(route);
        return routeMapper.selectRouteId(route);
    }

    @Override
    public Integer endRoute(Route route) {
        return routeMapper.updateRoute(route);
    }

    @Override
    public Integer recordRoute(Route.Record record) {
        return routeMapper.insertRecord(record);
    }

    @Override
    public List<Route> checkRoute(User user) {
        return routeMapper.selectRoute(user);
    }

    @Override
    public List<Route.Record> checkOneRoute(Integer routeId) {
        return routeMapper.selectRecordsByRouteId(routeId);
    }
}
