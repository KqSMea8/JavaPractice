/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package java.mail;

import com.google.common.base.Strings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Properties;


public class EmailActions {
    private static final Logger LOGGER      = LoggerFactory.getLogger(EmailActions.class);
    private Session session;
    private final String from     = "xy2953396112@gmail.com";
    private final String password = "x953396112";

    public EmailActions() {
        String host = "localhost";//or IP address

        //Get the session scala.object
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        //properties.setProperty("mail.smtp.sendpartial", "true");
        properties.setProperty("mail.smtp.auth", "true");
        //properties.setProperty("mail.smtp.socketFactory.port", "465");
        //properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        this.session = Session.getDefaultInstance(properties,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(from, password);
                    }
                });
    }

    public boolean sendEmail(List<JobResult> jobResults, String time, String addresses) {
        StringBuilder builder = new StringBuilder();

        builder.append("test 测试结果\n\n运行时间: ");
        builder.append(time);
        builder.append("\n\n");


        for (JobResult result :
                jobResults) {
            if (result.isCorrect()) {
                builder.append(result.getJobName());
                builder.append(" 测试通过");
                builder.append("\n");
            } else {
                builder.append(result.getJobName());
                if (Strings.isNullOrEmpty(result.getError())) {
                    builder.append(" 测试失败, 不同的行是 ");
                    builder.append(result.getDiffRows());
                } else {
                    builder.append(" 因为 ");
                    builder.append(result.getError());
                }
                builder.append("\n");
            }
        }

        //compose the message
        try {

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));

            for (String address : addresses.split(",")) {
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(address));
            }
            message.setSubject("result 测试结果");
            message.setText(builder.toString());

            // Send message
            Transport.send(message);
            LOGGER.info("message sent successfully.... {}", builder.toString());

        } catch (AddressException e) {
            e.printStackTrace();
        } catch (javax.mail.MessagingException e) {
            e.printStackTrace();
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        EmailActions actions = new EmailActions();
        JobResult result = new JobResult();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time =  dateFormat.format(new Date(System.currentTimeMillis()));
        result.setCorrect(true);
        result.setJobName("compare result !");
        result.setDiffRows("1, 23");
        actions.sendEmail(Arrays.asList(result, result), time, "xy2953396112@163.com");
        System.out.println("send email over !");
    }
}