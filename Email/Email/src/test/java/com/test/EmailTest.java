package com.test;
import java.util.Date;

import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;






public class EmailTest {
	

	//���ı�����
	@Test
	public void test1(){
		ClassPathXmlApplicationContext pc = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		JavaMailSender sender = pc.getBean(JavaMailSender.class);
		SimpleMailMessage message  = new SimpleMailMessage(); //�����������
		message.setFrom("2496801420@qq.com"); //������
		message.setTo("m15570656382@163.com");//�ռ���
		message.setSentDate(new Date()); //��������
		message.setSubject("spring �������"); //��������
		message.setText("<a href='#' >����</a>"); //��������
		sender.send(message); //����
		System.out.println("�����ɹ�");
	}
	
	//HTML �ı�����
	@Test
	public void test2()throws Exception{
		ClassPathXmlApplicationContext pc = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		JavaMailSender sender = pc.getBean(JavaMailSender.class);  
	    //�����ʼ���Ϣ,���ͼ��ʼ���html�ʼ�������   
	    MimeMessage mailMessage = sender.createMimeMessage(); 
	    MimeMessageHelper messageHelper = new MimeMessageHelper(mailMessage,true,"UTF-8");   
	    messageHelper.setFrom("2496801420@qq.com"); //������
	    messageHelper.setTo("m15570656382@163.com");//�ռ���  
	    messageHelper.setSubject("����HTML�ʼ���");   
	    //true ��ʾ����HTML��ʽ���ʼ�   
	    messageHelper.setText("<a href='https://www.baidu.com' >��ת�İٶ�</a>",true);   
	    sender.send(mailMessage);
	    System.out.println("�ʼ����ͳɹ�.."); 
	}	

	
	
}




