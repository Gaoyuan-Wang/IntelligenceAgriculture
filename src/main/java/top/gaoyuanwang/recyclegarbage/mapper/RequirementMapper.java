package top.gaoyuanwang.recyclegarbage.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import top.gaoyuanwang.recyclegarbage.pojo.Requirement;
import top.gaoyuanwang.recyclegarbage.pojo.User;

import java.util.List;

@Mapper
public interface RequirementMapper {

    List<Requirement> selectRequirements();

    Integer updateRequirement(Requirement requirement);

    List<Requirement> selectRequirementsByProduct(@Param("product")String product);

    List<Requirement> selectRequirementsByUser(User user);
}
