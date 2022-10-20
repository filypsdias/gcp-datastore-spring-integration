package cision.com.datastore.poc.controller;

import cision.com.datastore.poc.entity.User;
import cision.com.datastore.poc.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class UserController {

  private final UserService service;

  @PostMapping(value = "/users/create")
  public ResponseEntity<User> createUser(@RequestBody final User user) throws Exception {

    log.info("UserController.createUser - Start");
    log.debug("UserController.createUser - Start - Input - [{}]", user);

    User createdUser = service.create(user);

    log.debug("UserController.createUser - End - Output - [{}]", createdUser);

    return ResponseEntity
        .status(HttpStatus.CREATED)
        .build();
  }

  @GetMapping(value = "/users/{userId}")
  public ResponseEntity<User> findUser(@PathVariable final Long userId) {

    log.info("UserController.findUser - Start");
    log.debug("UserController.findUser - Start - Input - [{}]", userId);

    User userFound = service.findById(userId);

    log.debug("UserController.createUser - End - Output - [{}]", userId);

    return ResponseEntity
        .ok(userFound);
  }
}
