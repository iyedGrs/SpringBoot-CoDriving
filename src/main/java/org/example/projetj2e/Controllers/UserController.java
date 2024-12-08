package org.example.projetj2e.Controllers;

import org.example.projetj2e.Entities.User;
import org.example.projetj2e.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getAll")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User user){
        return userService.AddUser(user);

    }
    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }
    @DeleteMapping("/deleteUser")
    public User deleteUser(@RequestBody Long idUser){
        return userService.deleteUser(idUser);
    }

    @GetMapping("/getUserById/{userID}")
    public User getUserById(@PathVariable Long userID){
        Optional<User> user= userService.getUserById(userID);
        return user.orElse(null);

    }
}
