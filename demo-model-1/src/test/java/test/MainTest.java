package test;

import com.wds.dao.CityDao;

public class MainTest {

    public static void main(String[] args){
        CityDao dao = new CityDao();
        System.out.println(dao.selectOne(1));
    }
    
}
