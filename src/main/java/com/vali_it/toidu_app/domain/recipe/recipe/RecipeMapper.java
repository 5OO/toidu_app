package com.vali_it.toidu_app.domain.recipe.recipe;

import com.vali_it.toidu_app.service.recipe.UserRecipeNameInquiry;
import com.vali_it.toidu_app.service.recipe.UserRecipeRequest;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RecipeMapper {
    @Mapping(source = "userId", target = "user.id")
    Recipe recipeDtoToRecipe(UserRecipeRequest userRecipeRequest);

    @InheritInverseConfiguration(name = "recipeDtoToRecipe")
    UserRecipeRequest recipeToRecipeDto(Recipe recipe);

    @InheritConfiguration(name = "recipeDtoToRecipe")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateRecipeFromRecipeDto(UserRecipeRequest userRecipeRequest, @MappingTarget Recipe recipe);

    List<UserRecipeRequest> toRecipes(List<Recipe> recipe);


    @Mapping(target = "recipeId", source = "id")
    UserRecipeNameInquiry recipesToDto(Recipe recipe);

    List<UserRecipeNameInquiry> recipesToDtos(List<Recipe> recipes);

}
