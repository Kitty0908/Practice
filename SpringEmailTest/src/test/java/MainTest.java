import com.sun.mail.smtp.SMTPMessage;
import com.sun.mail.smtp.SMTPTransport;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class MainTest {

    private static Message createMessage(Session session) throws MessagingException {
        Message message = new MimeMessage(session);
        //设置发件人   InternetAddress 继承Address 用来存放地址
        message.setFrom(new InternetAddress("1260622312@qq.com"));
        //设置收件人    类型 TO 收件人   CC 抄送人    BCC 密送/暗送
        message.setRecipient(Message.RecipientType.TO,new InternetAddress("1260622312@qq.com"));
        //设置发送邮件的时间
//        message.setSentDate(new Date());
        message.setSubject("这是邮件的主题");
        message.setText("这是邮件的内容");
        //必须 保存邮件所有的更改
        message.saveChanges();
        return message;
    }

    public static void main (String[] args) throws MessagingException {
        //原生mail发送邮件方式
//        Properties props = new Properties();
//        //设置发送邮件的协议
//        props.put("mail.transport.protocol","smtp");
//        //设置发送邮件的主机名
//        props.put("mail.smtp.host","smtp.qq.com");
//        //设置发送邮件时是否进行身份验证
//        props.put("mail.smtp.auth","true");
//        //设置是否使用SSL安全连接 默认使用
//        props.put("mail.smtp.ssl.enable","true");
//
//        Session session = Session.getDefaultInstance(props);
//        Transport ts = session.getTransport();
//        ts.connect("1260622312@qq.com","tvlhugjnhbtfhcgh");
//        Message message = createMessage(session);
//        ts.sendMessage(message, message.getAllRecipients());
//        ts.close();

        JavaMailSender sender = (JavaMailSender) ((BeanFactory)new ClassPathXmlApplicationContext("ApplicationContext.xml")).getBean("sender");

        MimeMessage mimeMessage = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage);
        helper.setFrom("1260622312@qq.com");
        helper.setTo("1260622312@qq.com");
        helper.setSubject("这是一封邮件");
        helper.setText("这是邮件的内容");

        sender.send(mimeMessage);
    }
}
