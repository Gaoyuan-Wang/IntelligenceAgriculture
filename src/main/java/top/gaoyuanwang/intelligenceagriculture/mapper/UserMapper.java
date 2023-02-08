package top.gaoyuanwang.intelligenceagriculture.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.gaoyuanwang.intelligenceagriculture.pojo.User;

@Mapper
public interface UserMapper {

    User selectSingleUser(User user);

    Integer insertUser(User user);

    User selectUserById(User user);
}
