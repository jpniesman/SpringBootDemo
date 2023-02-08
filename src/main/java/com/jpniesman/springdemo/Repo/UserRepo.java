package com.jpniesman.springdemo.Repo;

import com.jpniesman.springdemo.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
