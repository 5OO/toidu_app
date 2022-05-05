package com.vali_it.toidu_app.domain.users.userrole;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
    @Query("select u from UserRole u where u.user.id = ?1")
    UserRole findUserRole(Integer userId);




















}