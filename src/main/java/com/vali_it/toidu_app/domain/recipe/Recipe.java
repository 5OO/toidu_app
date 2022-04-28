package com.vali_it.toidu_app.domain.recipe;

import com.vali_it.toidu_app.domain.users.user.User;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "recipe", schema = "toidu_app")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "users_id", nullable = false)
    private User users;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description", nullable = false, length = 200)
    private String description;

    @Column(name = "instructions", length = 2000)
    private String instructions;

    @Column(name = "public_recipe", nullable = false)
    private Boolean publicRecipe = false;

}