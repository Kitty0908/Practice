package test;

import com.wds.dao.AreaDao;
import com.wds.dao.CityDao;
import com.wds.dao.UserDao;
import com.wds.domain.User;
import com.wds.util.MySqlSessionUtil;

public class MainTest {

    public static void main(String[] args){
//        CityDao dao = new CityDao();
//        System.out.println(dao.selectOne(1));
//        UserDao userDao = MySqlSessionUtil.getMapper(UserDao.class);
//        User user = userDao.selectOne(1);
//        System.out.println(user);

        AreaDao dao = MySqlSessionUtil.getMapper(AreaDao.class);
        System.out.println(dao.selectOne(1));
    }
    
}
