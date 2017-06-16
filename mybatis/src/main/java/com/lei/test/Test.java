package com.lei.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.model.People;
import com.bean.model.Post;
import com.lei.bean.User;
import com.lei.dao.PeopleDao;
import com.lei.dao.UserDao;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String[] locations = {"beans.xml"};     
        ApplicationContext ctx =      
            new ClassPathXmlApplicationContext(locations);  
      //  UserDao userDao=(UserDao) ctx.getBean("userdaoimpl");
        //User user=userDao.getUser(2);        
        //System.out.println(user);
       // userDao.addUser(new User(4, "yang"));
        //userDao.deleteUser(4);
        //userDao.deleteUser("lei");
        //userDao.updateUser(new User(2, "wang"));
        PeopleDao peopleDao=(PeopleDao) ctx.getBean("peopledaoimple");
        People people=peopleDao.getPost(1);
        List<Post> list=people.getPosts();
        for (Post post : list) {
			System.out.println(post);
		}
        
	}

}
