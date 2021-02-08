import com.wds.springVideo.dao.*;
import com.wds.springVideo.entity.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/*.xml"})
public class DaoTest {

    @Autowired
    UserDao userDao;

    @Test
    public void test1(){

        User user = new User();
        user.setEmail("qqq");
        user.setPassword("123123");
        user.setCreateTime(new Date());
        user.setVipFlag(0);

        int count = userDao.insertUser(user);
        System.out.println(count);
    }

    @Test
    public void test2(){

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id","1");

        List<User> userList = userDao.findUserByCondition(map);
        System.out.println(userList);
    }

    @Test
    public void test3(){

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id","1");
        map.put("password","111");

        int count = userDao.updateUser(map);
        System.out.println(count);
    }

    @Autowired
    BannerDao bannerDao;

    @Test
    public void test4(){

        Banner banner = new Banner();
        banner.setFlag(0);
        banner.setImgUrl("111.jpg");
        banner.setCreateTime(new Date());

        int count = bannerDao.insertBanner(banner);
        System.out.println(count);
    }

    @Test
    public void test5(){

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",1);

        List<Banner> banners = bannerDao.findBannerByCondition(map);
        System.out.println(banners);
    }

    @Test
    public void test6(){

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",1);
        map.put("imgUrl","222.jpg");

        int count = bannerDao.updateBanner(map);
        System.out.println(count);

    }

    @Autowired
    CourseTopicDao courseTopicDao;

    @Test
    public void test7(){

        CourseTopic courseTopic = new CourseTopic();
        courseTopic.setFlag(0);
        courseTopic.setVipFlag(0);
        courseTopic.setCreateTime(new Date());

        int count = courseTopicDao.insertCourseTopic(courseTopic);
        System.out.println(count);

    }

    @Test
    public void test8(){

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",1);

        List<CourseTopic> courseTopicList = courseTopicDao.findCourseTopicByCondition(map);
        System.out.println(courseTopicList);

    }

    @Test
    public void test9(){

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",1);
        map.put("flag","2");

        int count = courseTopicDao.updateCourseTopic(map);
        System.out.println(count);

    }

    @Autowired
    CourseTypeDao courseTypeDao;

    @Test
    public void test10(){

        CourseType courseType = new CourseType();
        courseType.setFlag(0);
        courseType.setCreateTime(new Date());

        int count = courseTypeDao.insertCourseType(courseType);
        System.out.println(count);

    }

    @Test
    public void test11(){

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",1);

        List<CourseType> courseTypeList = courseTypeDao.findCourseTypeByCondition(map);
        System.out.println(courseTypeList);

    }

    @Test
    public void test12(){

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",1);
        map.put("flag","2");

        int count = courseTypeDao.updateCourseType(map);
        System.out.println(count);

    }

    @Autowired
    CourseVideoDao courseVideoDao;

    @Test
    public void test13(){

        CourseVideo courseVideo = new CourseVideo();
        courseVideo.setFlag(0);
        courseVideo.setCreateTime(new Date());

        int count = courseVideoDao.insertCourseVideo(courseVideo);
        System.out.println(count);

    }

    @Test
    public void test14(){

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",1);

        List<CourseVideo> courseVideoList = courseVideoDao.findCourseVideoByCondition(map);
        System.out.println(courseVideoList);

    }

    @Test
    public void test15(){

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",1);
        map.put("flag","2");

        int count = courseVideoDao.updateCourseVideo(map);
        System.out.println(count);

    }

    @Autowired
    ToolsItemDao toolsItemDao;

    @Test
    public void test16(){

        ToolsItem toolsItem = new ToolsItem();
        toolsItem.setFlag(0);
        toolsItem.setCreateTime(new Date());

        int count = toolsItemDao.insertToolsItem(toolsItem);
        System.out.println(count);

    }

    @Test
    public void test17(){

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",1);

        List<ToolsItem> toolsItemList = toolsItemDao.findToolsItemByCondition(map);
        System.out.println(toolsItemList);

    }

    @Test
    public void test18(){

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",1);
        map.put("flag","2");

        int count = toolsItemDao.updateToolsItem(map);
        System.out.println(count);

    }

    @Autowired
    ToolsTypeDao toolsTypeDao;

    @Test
    public void test19(){

        ToolsType toolsType = new ToolsType();
        toolsType.setFlag(0);
        toolsType.setCreateTime(new Date());

        int count = toolsTypeDao.insertToolsType(toolsType);
        System.out.println(count);

    }

    @Test
    public void test20(){

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",1);

        List<ToolsType> toolsTypeList = toolsTypeDao.findToolsTypeByCondition(map);
        System.out.println(toolsTypeList);

    }

    @Test
    public void test21(){

        Map<String,Object> map = new HashMap<String,Object>();
        map.put("id",1);
        map.put("flag","2");

        int count = toolsTypeDao.updateToolsType(map);
        System.out.println(count);

    }

    @Test
    public void test22(){
        HashMap<String,Integer> map = new HashMap<String, Integer>();
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "abcdefghijklmnopqrstuvwxyz";
        map.put(a,1);
        map.put(b,2);

        System.out.println(map.get(b));
        System.out.println(map);
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        for(Map.Entry<String,Integer> entry : set){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
