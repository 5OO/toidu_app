package com.vali_it.toidu_app.domain.users.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    @Query("select u from User u where u.username = ?1 and u.password = ?2")
    Optional<User> findByUsernameAndPassword(String username, String password);

    @Query("select (count(u) > 0) from User u where upper(u.username) = upper(?1)")
    boolean existsByUsername(String username);

    @Query("select u from User u where u.id = ?1")
    User findByUserId(Integer id);










}