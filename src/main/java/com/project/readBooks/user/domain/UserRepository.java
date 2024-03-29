package com.project.readBooks.user.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findByUserNo(Long userNo);

    Optional<User> findByUserId(String userId);
}
