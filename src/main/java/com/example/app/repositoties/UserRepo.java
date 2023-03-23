package com.example.app.repositoties;

import com.example.app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository(value = "users")
public interface UserRepo extends JpaRepository<User, Long>, JpaSpecificationExecutor<User> {

}
