package cision.com.datastore.poc.service.impl;

import cision.com.datastore.poc.entity.User;
import cision.com.datastore.poc.repository.UserRepository;
import cision.com.datastore.poc.service.UserService;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

  private final UserRepository repository;

  @Override
  @Transactional
  public User create(final User user) throws Exception {

    log.info("UserServiceImpl.create - Start");
    log.debug("UserServiceImpl.create - Start - Input [{}]", user);

    Optional<User> userFound = repository.findById(user.getId());
    if (userFound.isPresent()) {
      log.warn("User already exists");
      throw new Exception("User already exists"); //improve that
    }

    log.debug("UserServiceImpl.create - End - Input: {}. Output: {}", user, user);

    return repository.save(user);
  }

  @Override
  @Transactional
  public User findById(final Long userId) {

    log.info("UserServiceImpl.findById - Start");
    log.debug("UserServiceImpl.findById - Start - Input [{}]", userId);

    Optional<User> userFound = repository.findById(userId);
    if (!userFound.isPresent()) {
      log.warn("User not found");
      return null;
    }

    return userFound.get();
  }
}
