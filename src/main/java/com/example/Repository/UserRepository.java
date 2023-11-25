package com.example.Repository;

import com.example.Entity.Roles;
import com.example.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Roles, Long> {

    List<User> findByEmail(String email);


    User findById(int id);
}
