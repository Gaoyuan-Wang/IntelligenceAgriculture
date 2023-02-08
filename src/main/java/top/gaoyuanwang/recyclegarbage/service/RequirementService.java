package top.gaoyuanwang.recyclegarbage.service;

import top.gaoyuanwang.recyclegarbage.pojo.Requirement;
import top.gaoyuanwang.recyclegarbage.pojo.User;

import java.util.List;

public interface RequirementService {
    List<Requirement> checkRequirement(User user);

    List<Requirement> checkRequirementByProduct(String product);

    Integer appointRequirement(Requirement requirement);

    List<Requirement> checkAppointedRequirement(User user);
}
