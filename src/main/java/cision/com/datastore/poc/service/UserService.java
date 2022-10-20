package cision.com.datastore.poc.service;

import cision.com.datastore.poc.entity.User;

public interface UserService {

  User create(User user) throws Exception;
  User findById(Long id);

}
