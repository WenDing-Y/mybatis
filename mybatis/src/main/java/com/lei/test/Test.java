package com.lei.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lei.bean.User;
import com.lei.dao.UserDao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String[] locations = {"beans.xml"};     
        ApplicationContext ctx =      
            new ClassPathXmlApplicationContext(locations);  
        UserDao userDao=(UserDao) ctx.getBean("userdaoimpl");
        User user=userDao.getUser(2);        
        System.out.println(user);
       // userDao.addUser(new User(4, "yang"));
        //userDao.deleteUser(4);
        //userDao.deleteUser("lei");
        //userDao.updateUser(new User(2, "wang"));
        
        
	}

}
