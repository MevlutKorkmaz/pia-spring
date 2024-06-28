package com.PIA.Camp.MEV.entity;

import lombok.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.security.PrivateKey;

@Data// getter setter .. hepsini kapsıyo
@Document //gerekli değil ama mongo olduğunu belli etmek için
public class User {
    @Id
    private String id;
    private String name;
    private String lastName;
    private String userName;
    private Address address;
}
