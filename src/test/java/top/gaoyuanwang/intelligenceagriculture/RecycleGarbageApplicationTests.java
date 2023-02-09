package top.gaoyuanwang.intelligenceagriculture;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import top.gaoyuanwang.intelligenceagriculture.mapper.UserMapper;
import top.gaoyuanwang.intelligenceagriculture.pojo.User;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class RecycleGarbageApplicationTests {

    @Resource
    private DataSource dataSource;

    @Autowired
    private UserMapper userMapper;

    @Resource
    private RedisTemplate redisTemplate;

    @Test
    void dataSource() throws SQLException {
        System.out.println(dataSource.getConnection());
        System.out.println(userMapper.selectSingleUser(new User(1)));
    }

    @Test
    void redisTest(){
        //从Redis获取值
        String name = (String) redisTemplate.opsForValue().get("name");
        System.out.println(name);
    }

}
