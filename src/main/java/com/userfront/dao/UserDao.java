package com.userfront.dao;

import
        java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.userfront.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User,Long> {
	User findByUsername(String username);
    User findByEmail(String email);
    List<User> findAll();
}
