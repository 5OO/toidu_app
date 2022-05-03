package com.vali_it.toidu_app.domain.ingredient.ingredientiningredientgroup;

import com.vali_it.toidu_app.domain.ingredient.ingredient.Ingredient;
import com.vali_it.toidu_app.domain.ingredient.ingredient.IngredientDto;
import com.vali_it.toidu_app.domain.ingredient.ingredient.IngredientService;
import com.vali_it.toidu_app.domain.ingredient.ingredientgroup.IngredientGroup;
import com.vali_it.toidu_app.domain.ingredient.ingredientgroup.IngredientGroupRepository;
import com.vali_it.toidu_app.domain.ingredient.ingredientgroup.IngredientGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IngredientInIngredientGroupService {

    @Resource
    private IngredientInIngredientGroupMapper ingredientInIngredientGroupMapper;

    @Resource
    private IngredientInIngredientGroupRepository ingredientInIngredientGroupRepository;

    @Resource
    private IngredientGroupService ingredientGroupService;

    @Resource
    private IngredientService ingredientService;

    public IngredientInIngredientGroupDto getIngredientGroupByIngredientId(IngredientDto ingredientDto) {
        IngredientDto ingredientRequest = ingredientService.getIngredientById(ingredientDto.getId());
//        List<IngredientInIngredientGroup> ingredientGroups = ingredientInIngredientGroupRepository.findById(ingredientDto.getId());

        List<IngredientInIngredientGroup> ingredientGroups = ingredientInIngredientGroupRepository.findAllById(ingredientRequest.getId());
        return i;
    }
}
//    List<Ingredient> ingredients = ingredientRepository.findAll();
//        return ingredientMapper.toIngredients(ingredients);