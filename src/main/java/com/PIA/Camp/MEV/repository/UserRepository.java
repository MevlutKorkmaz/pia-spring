package com.PIA.Camp.MEV.repository;

import com.PIA.Camp.MEV.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {//idnin değeri <name, string>

    Optional<User> findByName(String name);
    Optional<User> findByNameAndLastName(String name, String lastName);
    //string jpa ya bak syntaxları öğren
    List<User>findByAddressCity(String city);

    List<User> findAllByNameAndLastNameAndAddressCountry(String name, String lastName, String country);
}
