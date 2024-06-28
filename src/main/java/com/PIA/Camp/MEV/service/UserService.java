package com.PIA.Camp.MEV.service;

import com.PIA.Camp.MEV.entity.User;
import com.PIA.Camp.MEV.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

@RequiredArgsConstructor
@Service//@compnent da olabilir
public class UserService {
    private final UserRepository userRepository;


    public User saveUser(User user){

        user.setId(UUID.randomUUID().toString());

        return userRepository.save(user);
    }


//    public User getUserById(String userId) {
//        Optional<User> userOp = userRepository.findById(userId);
//        if (userOp.isPresent()) {
//            return userOp.get();
//        } else {
//            throw new ("User with ID " + userId + " not found.");
//        }
//    }

    // Method to find users by name, last name, and country
    public List<User> findAllByNameAndLastNameAndAddressCountry(String name, String lastName, String country) {
        return userRepository.findAllByNameAndLastNameAndAddressCountry(name, lastName, country);
    }

}

