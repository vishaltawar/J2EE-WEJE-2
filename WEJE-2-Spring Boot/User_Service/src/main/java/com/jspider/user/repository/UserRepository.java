package com.jspider.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jspider.user.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
