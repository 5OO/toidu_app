package com.vali_it.toidu_app.domain.ingredient.ingredient;


import com.vali_it.toidu_app.validation.ValidationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class IngredientService {

    @Resource
    private IngredientRepository ingredientRepository;

    @Resource
    private IngredientMapper ingredientMapper;

    @Resource
    private ValidationService validationService;

    public List<IngredientDto> getAllIngredients() {
        List<Ingredient> ingredients = ingredientRepository.findAll();
        return ingredientMapper.toIngredients(ingredients);
    }

    public List<IngredientDto> findIngredientIdByName(String name) {
        List<Ingredient> ingredients = ingredientRepository.findIngredientByName(name);
        return ingredientMapper.toIngredients(ingredients);
    }

    public IngredientDto addNewIngredient(IngredientDto ingredientDto) {
        Ingredient ingredient = ingredientMapper.ingredientDtoToIngredient(ingredientDto);
        // TODO: 03.05.2022  VAJA TEHA VALIDATION
        ingredientRepository.save(ingredient);
        return ingredientMapper.ingredientToIngredientDto(ingredient);
    }

    public IngredientDto getIngredientById(Integer id) {
        Ingredient ingredient = ingredientRepository.getById(id);
        return ingredientMapper.ingredientToIngredientDto(ingredient);
    }

    public void removeIngredientById(Integer id) {
        Ingredient ingredient = ingredientRepository.getById(id);
        ingredientRepository.delete(ingredient);
    }

    public void updateIngredientById(Integer id, IngredientDto ingredientDto) {
        Ingredient ingredient = ingredientRepository.getById(id);
        ingredientMapper.updateIngredientFromIngredientDto(ingredientDto, ingredient);
        ingredientRepository.save(ingredient);
    }


//    private Ingredient getValidIngredientById(Integer ingredientId) {
//        Optional<Ingredient> ingredient = ingredientRepository.findById(ingredientId);
//        validationService.ingredientExists(ingredientId, ingredient);
//        return ingredient.get();
//    }


}

