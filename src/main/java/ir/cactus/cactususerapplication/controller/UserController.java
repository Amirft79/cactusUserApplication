package ir.cactus.cactususerapplication.controller;

import ir.cactus.cactususerapplication.model.User;
import ir.cactus.cactususerapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @GetMapping("/helloUser/{user}")
    public String helloUser(@PathVariable("user") String user) {
        return "the user is " + user;
    }

    @PostMapping("/createUser")
    public String createUser(@RequestBody User user) {
        userRepository.save(user);
        return "success";
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>>getAllUsers(){
        return ResponseEntity.ok(userRepository.findAll());
    }
}
