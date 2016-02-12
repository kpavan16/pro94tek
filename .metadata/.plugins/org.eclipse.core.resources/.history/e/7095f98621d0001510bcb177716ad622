package com.pms.security.main;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pms.security.bean.User;
import com.pms.security.exeception.PMSException;
import com.pms.security.service.IUserManagementService;

public class PMSSecurityTest {

   @SuppressWarnings ("resource")
   public static void main (String[] args) throws PMSException {
      ApplicationContext appContext = new ClassPathXmlApplicationContext("config/application-context.xml");
      IUserManagementService userManagementService = (IUserManagementService) appContext
               .getBean("userManagementService");

      // insert user
      User user = new User();
      user.setUsername("prasanna111");
      user.setPassword("hanuman");
      user.setCity("hyderbad");
      user.setFirstName("prasanna kumar");
      user.setEmailId("prasanna.kuppa@gmail.com");
      user.setCreatedDate(new Date());
      user.setCity("Hyd");
      user.setState("Telgana");
      user.setZip("5060001");
      user.setCountry("India");

      userManagementService.createUser(user);
   }
}
