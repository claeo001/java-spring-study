package com.project.springapistudy.springcrudpratice.repository;

import com.project.springapistudy.springcrudpratice.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository  extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
