package com.vali_it.toidu_app.domain.users.user;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user", schema = "toidu_app")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "username", nullable = false, length = 50)
    private String username;

    @Column(name = "password", nullable = false, length = 100)
    private String password;
}