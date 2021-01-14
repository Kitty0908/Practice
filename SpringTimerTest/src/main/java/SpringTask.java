import java.util.Arrays;
import java.util.List;

public class SpringTask {

    String[] users = {"张三","李四","王五","赵六","吴七"};
    final List<String> userList = Arrays.asList(users);

    public void doIt(){
        for(String user:userList){
            System.out.println("给"+user+"发送一条信息");
        }
    }
}
