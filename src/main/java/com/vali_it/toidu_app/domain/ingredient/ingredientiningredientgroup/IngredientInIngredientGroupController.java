package com.vali_it.toidu_app.domain.ingredient.ingredientiningredientgroup;

import com.vali_it.toidu_app.domain.ingredient.ingredient.IngredientDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ingredient-in-group")
public class IngredientInIngredientGroupController {

    @Resource
    private IngredientInIngredientGroupService ingredientInIngredientGroupService;

    private IngredientInIngredientGroupDto getIngredientGroupByIngredientId(IngredientDto ingredientDto) {
        return ingredientInIngredientGroupService.getIngredientGroupByIngredientId(ingredientDto);
    }
}
