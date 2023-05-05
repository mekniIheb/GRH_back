package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.serviceImpl.UserServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@CrossOrigin("*")
public class UserController {
    private final UserServiceImpl userService;

    @PostMapping("/user")
    public ResponseEntity<User> ajouterUser(@RequestBody User user) {
        return new ResponseEntity<>(userService.ajouterUser(user), HttpStatus.OK);
    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> getAllUser() {
        return new ResponseEntity<>(userService.getListUser(), HttpStatus.OK);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        return new ResponseEntity<>(userService.getUserById(id), HttpStatus.OK);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<HttpStatus> supprimerUser(@PathVariable Long id) {
        userService.supprimerUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> modifierUser(@RequestBody User user, @PathVariable Long id) {
        return new ResponseEntity<>(userService.modifierUser(user, id), HttpStatus.OK);
    }

}
