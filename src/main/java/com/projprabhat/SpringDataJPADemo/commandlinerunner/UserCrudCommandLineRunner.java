package com.projprabhat.SpringDataJPADemo.commandlinerunner;

import com.projprabhat.SpringDataJPADemo.model.User;
import com.projprabhat.SpringDataJPADemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserCrudCommandLineRunner implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {

        User user1=new User("Rahul","Raturi");
        userRepository.save(user1);

        User user2=new User("Rad","Brad");
        userRepository.save(user2);

        userRepository.save(new User("Pie","Die"));

        userRepository.save(new User("Rad","Bill"));

        List<User> users=userRepository.findByFirstName("Rad");
        System.out.println("User with first name 'Rad' "+users);

        users=userRepository.findByFirstNameOrLastName("Rad","Die");
        System.out.println("Users with firstname rad or lastname die "+users);

        /*List<User> users= userRepository.findAll();
        System.out.println(users);

        userRepository.delete(user2);

        users= userRepository.findAll();
        System.out.println(users);

        user2.setFirstName("Brain");
        userRepository.save(user2);

        users= userRepository.findAll();
        System.out.println(users);*/

    }
}
