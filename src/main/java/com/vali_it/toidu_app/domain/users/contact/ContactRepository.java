package com.vali_it.toidu_app.domain.users.contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
    @Query("select c from Contact c where c.firstName = ?1 and c.lastName = ?2")
    Contact findByFirstNameAndLastName(String firstName, String lastName);

    @Query("select c from Contact c where c.user.id = ?1")
    Contact findUserById(Integer id);

    @Query("select c from Contact c where c.user.id = ?1")
    Contact findContactByUserId(Integer id);

    @Query("select c from Contact c where c.user.id = ?1")
    Contact findUserFirstAndLastName(Integer userId);
}