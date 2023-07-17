package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.model.User;
@Service
public class UserServivceImpl implements UserService {

	//fake list of user
	
	
	List<User> list = List.of(
			new User(101L,"Lee","89898989"),
			new User(102L,"John","89675646"),
			new User(103L,"Johnson","89898989"),
			new User(104L,"Sameer","89675646")
			);
	@Override
	public User getUser(Long id) {
		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
