package com.otekin.dev.demo.repository;

import com.otekin.dev.demo.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}
