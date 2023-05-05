package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {

    User ajouterUser(User user);
    User modifierUser(User user,Long id);
    void supprimerUser(Long id);
    List<User> getListUser();
    User getUserById(Long id );

}
