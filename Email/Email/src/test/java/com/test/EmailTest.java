package com.test;
import java.util.Date;

import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;






public class EmailTest {
	

	//纯文本发送
	@Test
	public void test1(){
		ClassPathXmlApplicationContext pc = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		JavaMailSender sender = pc.getBean(JavaMailSender.class);
		SimpleMailMessage message  = new SimpleMailMessage(); //构建邮箱对象
		message.setFrom("2496801420@qq.com"); //发件人
		message.setTo("m15570656382@163.com");//收件人
		message.setSentDate(new Date()); //发件日期
		message.setSubject("spring 邮箱测试"); //发件主题
		message.setText("<a href='#' >激活</a>"); //发件内容
		sender.send(message); //发送
		System.out.println("发件成功");
	}
	
	//HTML 文本发送
	@Test
	public void test2()throws Exception{
		ClassPathXmlApplicationContext pc = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		JavaMailSender sender = pc.getBean(JavaMailSender.class);  
	    //建立邮件消息,发送简单邮件和html邮件的区别   
	    MimeMessage mailMessage = sender.createMimeMessage(); 
	    MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage,true,"UTF-8");   
	    messageHelper.setFrom("2496801420@qq.com"); //发件人
	    messageHelper.setTo("m15570656382@163.com");//收件人  
	    messageHelper.setSubject("测试HTML邮件！");   
	    //true 表示启动HTML格式的邮件   
	    messageHelper.setText("<a href='https://www.baidu.com' >跳转的百度</a>",true);   
	    sender.send(mailMessage);
	    System.out.println("邮件发送成功.."); 
	}	

	
	
}




