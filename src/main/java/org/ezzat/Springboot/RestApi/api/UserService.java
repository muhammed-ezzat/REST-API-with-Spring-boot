package org.ezzat.Springboot.RestApi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    //private UserDB userDB;

    public User addUser(User user) {
        return userRepository.insert(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String id)
    {
        return userRepository.findById(id).get();
    }

    public void deleteUser(String id)
    {
        userRepository.deleteById(id);
    }

    public User updateUser(User user)
    {
        return userRepository.save(user);
    }
}
