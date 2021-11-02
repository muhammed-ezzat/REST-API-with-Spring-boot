package org.ezzat.Springboot.RestApi.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/users")
public class UserController
{
    @Autowired
    private  UserService userService;

    @PostMapping
    public void addUser(@RequestBody User user)
    {
         userService.addUser(user);
    }

    @GetMapping
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @GetMapping(path = "{id}")
    public User getUserByID(@PathVariable("id") String  id)
    {
        return userService.getUserById(id);
    }


    @DeleteMapping(path = "{id}")
    public void deleteUser(@PathVariable("id") String  id)
    {
        userService.deleteUser(id);
    }

    @PutMapping(path = "{id}")
    public User updateUser(@RequestBody User user)
    {
        return userService.updateUser(user);
    }

}
