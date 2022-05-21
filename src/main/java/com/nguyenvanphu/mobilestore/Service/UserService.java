package com.nguyenvanphu.mobilestore.Service;

import com.nguyenvanphu.mobilestore.Model.User;
import com.nguyenvanphu.mobilestore.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> listAll(){
        return (List<User>) repo.findAll();
    }

    public Optional<User> findById(String id){
        return repo.findById(Integer.parseInt(id));
    }

    public User findByEmail(String email){
        return repo.findByEmail(email);
    }

    public boolean checkLogin(String email, String password){
        User user = findByEmail(email);

        if( user.getPassword().equals(password)){
            return true;
        }
        return false;
    }
}
