package com.vali_it.toidu_app.domain.ingredient.ingredientiningredientgroup;

import com.vali_it.toidu_app.domain.ingredient.ingredient.Ingredient;
import com.vali_it.toidu_app.domain.ingredient.ingredient.IngredientRepository;
import com.vali_it.toidu_app.domain.ingredient.ingredientgroup.IngredientGroup;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IngredientInIngredientGroupService {


    @Resource
    private IngredientInIngredientGroupRepository ingredientInIngredientGroupRepository;

    @Resource
    private IngredientInIngredientGroupMapper ingredientInIngredientGroupMapper;
    @Resource
    private IngredientRepository ingredientRepository;

    public List<IngredientInIngredientGroupDto> getIngredientByIngredientGroupId(Integer ingredientGroupId) {
        List<IngredientInIngredientGroup> ingredientGroups = ingredientInIngredientGroupRepository.findByIngredientGroup(ingredientGroupId);
        return ingredientInIngredientGroupMapper.toIngredientDto(ingredientGroups);
    }

}
