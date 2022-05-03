package com.vali_it.toidu_app.service.recipe;


import com.vali_it.toidu_app.domain.users.user.User;
import lombok.Data;


@Data
public class UserRecipeRequest {
    private  Integer usersId;   // TODO: 03.05.2022  kontrolli kas on õige klass ja kas seda üldse vaja on?
    private String name;
    private String description;
    private String instructions;
    private Boolean publicRecipe;

}
