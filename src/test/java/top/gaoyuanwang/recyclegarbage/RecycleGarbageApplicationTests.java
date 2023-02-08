package top.gaoyuanwang.recyclegarbage;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.gaoyuanwang.recyclegarbage.mapper.UserMapper;
import top.gaoyuanwang.recyclegarbage.pojo.User;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class RecycleGarbageApplicationTests {

    @Resource
    private DataSource dataSource;

    @Autowired
    private UserMapper userMapper;

    @Test
    void dataSource() throws SQLException {
        System.out.println(dataSource.getConnection());
        System.out.println(userMapper.selectSingleUser(new User(1)));
    }

}
