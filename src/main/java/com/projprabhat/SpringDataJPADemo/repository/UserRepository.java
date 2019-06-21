package com.projprabhat.SpringDataJPADemo.repository;

import com.projprabhat.SpringDataJPADemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

//We have in build functionality provided by spring data JPA for interacting with any relational database through an
//interface JpaRepository<,>-it needs two parameters.first one in instance type,here it is User. second on is Primary key type

//by wrtitng the below line, we inherit all the queries which are provided by the spring data JPA.
@Component
public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findByFirstName(String firstName);
    List<User> findByFirstNameOrLastName(String firstName,String lastName);
}
