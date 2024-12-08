package org.example.projetj2e.Services;

import org.example.projetj2e.Entities.User;
import org.example.projetj2e.Repositories.RepoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private RepoUser repoUser;

    public List<User> getAllUsers() {
        return repoUser.findAll();
    }
    public Optional<User> getUserById(Long id) {
        return repoUser.findById(id);
    }
    public User AddUser(User user) {
        return repoUser.save(user);
    }
    public User updateUser(User user){
        Optional<User> optionalUser = repoUser.findById(user.getIdUser());
        if(optionalUser.isPresent()){
            return repoUser.save(user);
        }
        else {
            return null;
        }
    }
    public User deleteUser(Long idUser) {
        Optional<User> optionalUser = repoUser.findById(idUser);
        if(optionalUser.isPresent()){
            repoUser.deleteById(idUser);
            return optionalUser.get();
        }
        return null;
    }

};

