package top.gaoyuanwang.intelligenceagriculture.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.gaoyuanwang.intelligenceagriculture.mapper.RequirementMapper;
import top.gaoyuanwang.intelligenceagriculture.pojo.Requirement;
import top.gaoyuanwang.intelligenceagriculture.pojo.User;
import top.gaoyuanwang.intelligenceagriculture.service.RequirementService;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
@Slf4j
public class RequirementServiceImpl implements RequirementService {
    @Resource
    RequirementMapper requirementMapper;

    @Override
    public List<Requirement> checkRequirement(User user) {
        return requirementMapper.selectRequirements();
    }

    @Override
    public List<Requirement> checkRequirementByProduct(String product) {
        return requirementMapper.selectRequirementsByProduct(product);
    }

    @Override
    public Integer appointRequirement(Requirement requirement) {
        return requirementMapper.updateRequirement(requirement);
    }

    @Override
    public List<Requirement> checkAppointedRequirement(User user) {
        return requirementMapper.selectRequirementsByUser(user);
    }
}
