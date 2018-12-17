package com.demo.sm.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.demo.sm.entity.UserEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void test() {
		List<UserEntity> users = userMapper.getAll();
		for (UserEntity user : users) {
			System.out.println(user.toString());
		}
	}

}
