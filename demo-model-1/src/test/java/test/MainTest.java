package test;

import com.wds.action.Target;
import com.wds.domain.City;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    public static void main(String[] args){
//        CityDao dao = new CityDao();
//        System.out.println(dao.selectOne(1));
//        UserDao userDao = MySqlSessionUtil.getMapper(UserDao.class);
//        User user = userDao.selectOne(1);
//        System.out.println(user);

//        AreaDao dao = MySqlSessionUtil.getMapper(AreaDao.class);
//        System.out.println(dao.selectOne(1));

        BeanFactory factory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//        City city = (City)factory.getBean("city");
//        System.out.println(city);

        Target target = (Target)factory.getBean("target");
        target.execut();
    }
    
}
