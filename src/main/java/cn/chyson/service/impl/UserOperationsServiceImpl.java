package cn.chyson.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import cn.chyson.domain.User;
import cn.chyson.service.UserOperationsService;

/**
 * @author Chyson
 * 
 */
@Service
public class UserOperationsServiceImpl implements UserOperationsService {
	@Autowired
	private RedisTemplate redisTemplate;

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		ValueOperations<String, User> valueops = redisTemplate.opsForValue();
		valueops.set(user.getId(), user);
	}

	@Override
	public User getUser(String key) {
		ValueOperations<String, User> valueops = redisTemplate.opsForValue();
		User user = valueops.get(key);
		return user;
	}

}
