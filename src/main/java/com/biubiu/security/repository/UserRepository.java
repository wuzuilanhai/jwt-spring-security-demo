package com.biubiu.security.repository;

import com.biubiu.model.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by zhanghaibiao on 2017/10/12.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
