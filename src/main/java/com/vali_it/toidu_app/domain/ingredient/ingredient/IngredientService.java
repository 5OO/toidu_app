package com.vali_it.toidu_app.domain.ingredient.ingredient;


import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IngredientService {

    @Resource
    private IngredientRepository ingredientRepository;

    @Resource
    private IngredientMapper ingredientMapper;

    public List<IngredientDto> getAllIngredients() {
        List<Ingredient> ingredients = ingredientRepository.findAll();
        return ingredientMapper.toIngredients(ingredients);
    }

    public  List<IngredientDto> findIngredientById(Integer id) {
//        List<Ingredient> ingredients = ingredientRepository.findById(id);
//        return ingredientMapper.toIngredients(ingredients);
        return null;
    }
}

