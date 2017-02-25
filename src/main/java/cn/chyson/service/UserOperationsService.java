package cn.chyson.service;

import cn.chyson.domain.User;

/**
 * @author Chyson
 * 
 */
public interface UserOperationsService {

	void add(User user);

	User getUser(String key);

}
