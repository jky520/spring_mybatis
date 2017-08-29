package com.hx.spring.dao;

import org.springframework.stereotype.Repository;

import com.hx.spring.entity.User;
@Repository
public interface UserDao {
	void add(User user);
	
	void delete(int id);
	
	User load(int id);
}
