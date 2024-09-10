package com.example.bunnysugar.repository;

import com.example.bunnysugar.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // JPA Repository提供基本的CRUD操作
}
