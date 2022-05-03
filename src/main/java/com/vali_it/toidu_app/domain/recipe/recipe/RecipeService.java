package com.vali_it.toidu_app.domain.recipe.recipe;

import com.vali_it.toidu_app.domain.users.user.User;
import com.vali_it.toidu_app.domain.users.user.UserRepository;
import com.vali_it.toidu_app.service.recipe.UserRecipeRequest;
import com.vali_it.toidu_app.service.recipe.UserRecipeResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RecipeService {

    @Resource
    private UserRepository userRepository;

    @Resource
    private RecipeRepository recipeRepository;

    @Resource
    private RecipeMapper recipeMapper;

    public UserRecipeResponse addNewRecipe(UserRecipeRequest userRecipeRequest) {
        Recipe recipe = recipeMapper.recipeDtoToRecipe(userRecipeRequest);
        recipe.setName(userRecipeRequest.getName());
        recipe.setDescription(userRecipeRequest.getDescription());
        recipe.setInstructions(userRecipeRequest.getInstructions());
        recipe.setPublicRecipe(userRecipeRequest.getPublicRecipe());

        User user = userRepository.getById(userRecipeRequest.getUsersId());
        recipe.setUsers(user);

        recipeRepository.save(recipe);

        return null;
    }
}
