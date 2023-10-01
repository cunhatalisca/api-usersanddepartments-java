package com.devsuperior.UserDept.repositories;

import com.devsuperior.UserDept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
