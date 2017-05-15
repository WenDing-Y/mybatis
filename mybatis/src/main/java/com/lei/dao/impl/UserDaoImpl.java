package com.lei.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.lei.bean.User;
import com.lei.dao.UserDao;

public class UserDaoImpl implements UserDao {
	@Autowired
    private SqlSessionTemplate sqlSessionTemplate;
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("getOneUserId",id);
	}
    
	public User getUser(String name) {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("getOneUserName",name);
	}

	public User getUser() {
		// TODO Auto-generated method stub
		return sqlSessionTemplate.selectOne("getAllUser");
	}

	public void addUser(User user) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.insert("insert", user);
	}

	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.delete("deleteId", id);
	}

	public void deleteUser(String name) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.delete("deleteName",name);
	}

	public void updateUser(User user) {
		// TODO Auto-generated method stub
		sqlSessionTemplate.update("update", user);
	}

}
