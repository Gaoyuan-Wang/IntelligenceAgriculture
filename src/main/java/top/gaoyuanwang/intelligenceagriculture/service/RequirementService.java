package top.gaoyuanwang.intelligenceagriculture.service;

import top.gaoyuanwang.intelligenceagriculture.pojo.Requirement;
import top.gaoyuanwang.intelligenceagriculture.pojo.User;

import java.util.List;

public interface RequirementService {
    List<Requirement> checkRequirement(User user);

    List<Requirement> checkRequirementByProduct(String product);

    Integer appointRequirement(Requirement requirement);

    List<Requirement> checkAppointedRequirement(User user);
}
