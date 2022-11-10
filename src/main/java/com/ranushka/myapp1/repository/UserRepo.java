package com.ranushka.myapp1.repository;

import com.ranushka.myapp1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

}
