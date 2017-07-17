package com.lei.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.bean.model.People;
import com.bean.model.Post;
import com.lei.dao.PeopleDao;

public class PeopleDaoImpl implements PeopleDao {
    @Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	public People getPost(int id) {
		// TODO Auto-generated method stub
	    return sqlSessionTemplate.selectOne("getUser", id);
	}

}
