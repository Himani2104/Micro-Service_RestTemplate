package com.example.restemplate.services;

import com.example.restemplate.entity.User;
import com.example.restemplate.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User getUser(Long id) {
         User user=null;
         Optional<User> userOptional=userRepository.findById(id);
         if (userOptional.isPresent())
           user= userOptional.get();
        List contacts=this.restTemplate.getForObject("http://localhost:9091/contact/user/"+user.getId(), List.class);
        user.setContactList(contacts);

         return user;

    }

    public User createNewUser(User user) {
        User user1=new User();
        user1.setName(user.getName());
        user1.setAge(user.getAge());
         userRepository.save(user1);
         return user1;

    }
}
