import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class MainTest {

    public static void main(String[] args) throws ParseException {

        //原生Timer流程
//        String[] users = {"张三","李四","王五","赵六","吴七"};
//        final List<String> userList = Arrays.asList(users);
//        SimpleDateFormat sdf = new SimpleDateFormat("yy:MM:dd kk:mm:ss");
//        Date date = sdf.parse("2021:1:13 19:30:20");
//        Timer timer = new Timer();
//
//        timer.schedule(new TimerTask(){
//            public void run() {
//                for(String user:userList){
//                    System.out.println("给"+user+"发送一条信息");
//                }
//            }
//        },date,3000);

        BeanFactory factory = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    }
}
