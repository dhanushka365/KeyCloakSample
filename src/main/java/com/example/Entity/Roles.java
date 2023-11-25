package com.example.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name="roles")
@Entity
@Getter
@Setter
public class Roles {

    @Id
    @GeneratedValue
    @Column(name="id")
    private  Long id;

    @Column(name = "role")
    private String role;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

}
