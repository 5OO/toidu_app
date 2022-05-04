package com.vali_it.toidu_app.domain.ingredient.ingredient;


import com.vali_it.toidu_app.domain.ingredient.ingredientiningredientgroup.IngredientInIngredientGroupService;
import com.vali_it.toidu_app.service.ingredient.IngredientRequest;
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

    @Resource
    private IngredientInIngredientGroupService ingredientInIngredientGroupService;

    public List<IngredientRequest> getAllIngredients() {
        List<Ingredient> ingredients = ingredientRepository.findAll();
        return ingredientMapper.toIngredients(ingredients);
    }

    public List<IngredientRequest> findIngredientIdByName(String name) {
        List<Ingredient> ingredients = ingredientRepository.findIngredientByName(name);
        return ingredientMapper.toIngredients(ingredients);
    }

    public IngredientRequest addNewIngredient(IngredientRequest ingredientRequest) {
        Ingredient ingredient = ingredientMapper.ingredientDtoToIngredient(ingredientRequest);
        // TODO: 03.05.2022  VAJA TEHA VALIDATION
        ingredientRepository.save(ingredient);
        return ingredientMapper.ingredientToIngredientDto(ingredient);
    }

    public IngredientRequest getIngredientById(Integer id) {
        Ingredient ingredient = ingredientRepository.getById(id);
        return ingredientMapper.ingredientToIngredientDto(ingredient);
    }

    public void removeIngredientById(Integer id) {
        Ingredient ingredient = ingredientRepository.getById(id);
        ingredientRepository.delete(ingredient);
    }

    public void updateIngredientById(Integer id, IngredientRequest ingredientRequest) {
        Ingredient ingredient = ingredientRepository.getById(id);
        ingredientMapper.updateIngredientFromIngredientDto(ingredientRequest, ingredient);
        ingredientRepository.save(ingredient);
    }


//    private Ingredient getValidIngredientById(Integer ingredientId) {
//        Optional<Ingredient> ingredient = ingredientRepository.findById(ingredientId);
//        validationService.ingredientExists(ingredientId, ingredient);
//        return ingredient.get();
//    }


}

