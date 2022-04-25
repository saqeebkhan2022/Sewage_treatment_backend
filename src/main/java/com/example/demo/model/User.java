package com.example.demo.model;

import lombok.Data;
import javax.persistence.*;
import java.util.Set;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String State;
    private String city;
    private String address;
    private String image;
    @ManyToOne(fetch = FetchType.LAZY)
    private Set<Role> roles;
}
