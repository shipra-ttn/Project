package com.springsecurity.demo.springsecurityoauth2bootcampmaven.repositories;


import com.springsecurity.demo.springsecurityoauth2bootcampmaven.dto.UserDto;
import com.springsecurity.demo.springsecurityoauth2bootcampmaven.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findUserByEmail(String email);

}

