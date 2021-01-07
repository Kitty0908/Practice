import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class MainTest {

    public static void main(String[] args) {
        BeanFactory factory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) factory.getBean("jdbcTemplate");

//        String sql = "INSERT INTO USER VALUE(?,?,?)";
//        Integer count = jdbcTemplate.update(sql,null,"赵六","123");

//        String sql = "SELECT * FROM USER";
//        List<Map<String,Object>> list = jdbcTemplate.queryForList(sql);
//        System.out.println(list);

//        String sql = "SELECT UID,UNAME,UPASSWORD FROM USER WHERE UID = ?";
//        User user = jdbcTemplate.queryForObject(sql, new RowMapper<User>() {
//            public User mapRow(ResultSet resultSet, int i) throws SQLException {
//                User user = new User();
//                user.setUid(resultSet.getInt("uid"));
//                user.setUname(resultSet.getString("uname"));
//                user.setUpassword(resultSet.getString("upassword"));
//                return user;
//            }
//        },1);
//
//        System.out.println(user);

        String sql = "SELECT * FROM USER";
        List<User> users = jdbcTemplate.query(sql, new RowMapper<User>() {
            public User mapRow(ResultSet resultSet, int i) throws SQLException {
                User user = new User();
                user.setUid(resultSet.getInt("uid"));
                user.setUname(resultSet.getString("uname"));
                user.setUpassword(resultSet.getString("upassword"));
                return user;
            }
        });

        System.out.println(users);
    }
}
