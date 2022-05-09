package com.vali_it.toidu_app.domain.users.contact;

import com.vali_it.toidu_app.domain.users.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
    @Query("select c from Contact c where c.user.id = ?1")
    Contact findUserById(Integer id);

    @Query("select c from Contact c where c.user.id = ?1")
    Contact findContactByUserId(Integer id);


}