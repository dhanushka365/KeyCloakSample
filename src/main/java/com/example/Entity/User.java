package com.example.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Table(name="user")
@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long Id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="user_name")
    private String userName;

    @Column(name="password")
    private String password;

    @OneToMany(mappedBy = "user" , fetch = FetchType.EAGER)
    private Set<Roles> roles;
}
