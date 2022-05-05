package com.vali_it.toidu_app.domain.recipe.recipe;

import com.vali_it.toidu_app.domain.users.user.User;
import com.vali_it.toidu_app.domain.users.user.UserRepository;
import com.vali_it.toidu_app.service.recipe.UserIngredientRequest;
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
        //teised väljad tegi mapper ära automaatselt

        User user = userRepository.getById(userRecipeRequest.getUserId());
        //id tuleb käsitsi mäppida.

        recipe.setUser(user);

        recipeRepository.save(recipe);
        //salvestamise hetkel tekkib recipe objekti id. Ül oli luua uue retsepti id.

        UserRecipeResponse response = new UserRecipeResponse();
        response.setRecipeId(recipe.getId());
        return response;
    }


}
